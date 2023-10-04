class Solution {
    public String solution(String my_string) {
        String ss = "aeiou";
        
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int i= sb.length()-1; i >= 0 ; i--) {
        	
        	String kk = sb.charAt(i)+"";
        	
        	for(int j = 0; j< ss.length(); j++) {
        		if(kk.contains(ss.charAt(j)+"") ) {
        			sb.deleteCharAt(i);
        		}
        	}
        }
        return sb.toString();
    }
}