import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public String solution(String polynomial) {
        int number = 0; 
        int x = 0;
        Pattern pattern = Pattern.compile("\\b([1-9][0-9]?)\\b");
        
        String[] arr = polynomial.split(" ");
        for(String k : arr) {
        	Matcher matcher = pattern.matcher(k);
        	if (matcher.find()) {
                number += Integer.parseInt(k); 
            }
        	else if(k.equals("x")) {
        		x++;
        	}
        	else if(!k.equals("+")) {
        		k = k.replaceFirst("x", "");
        		x += Integer.parseInt(k);
        	}
        }
        
        String strX = x == 1 ? "x" : String.valueOf(x)+"x";
        String strNumber = String.valueOf(number);
      
        return number > 0 ? x > 0 ? strX+" + "+ strNumber : strNumber : strX;
    }
}