class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        
        
        for(int i = 0 ; i < my_string.length(); i++) {
        	for(int j=0; j < my_string.length(); j++) {
        		if(my_string.charAt(i) == my_string.charAt(j) && i!=j ){
        			answer = answer.replace(my_string.charAt(i), '!');
        			answer = answer.replaceFirst("!", my_string.charAt(i)+"");
        			answer = answer.replaceAll("[!]", "");
        		}
        	}
        }
        
        return answer;
    }
}