class Solution {
    public int solution(int i, int j, int k) {
	        
	        String str = "";
	        for(int x = i; x <= j ; x++) {
	        	str += x+"";
	        }
	       
	        return (int) str.chars().filter(c -> c == Character.forDigit(k, 10)).count();
	    }
}