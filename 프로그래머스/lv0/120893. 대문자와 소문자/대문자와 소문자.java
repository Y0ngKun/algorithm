class Solution {
    public String solution(String my_string) {
	        String copy = my_string;
	        
	        my_string = my_string.replaceAll("[^a-z]", "!").toUpperCase();
	        copy = copy.replaceAll("[^A-Z]", "");
	        
	        for(int i = 0; i < copy.length(); i++) {
	        	String tmp = copy.charAt(i)+"";
	        	my_string = my_string.replaceFirst("[!]", tmp.toLowerCase());
	        }
	        return my_string;
	    }
}