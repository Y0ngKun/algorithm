class Solution {
   public String solution(String bin1, String bin2) {
	        int answer = Integer.parseUnsignedInt(bin1, 2) + Integer.parseUnsignedInt(bin2, 2);
	        return Integer.toString(answer, 2);
	    }
}