class Solution {
   public String solution(String bin1, String bin2) {
	        return Integer.toString(Integer.parseUnsignedInt(bin1, 2) + Integer.parseUnsignedInt(bin2, 2), 2);
	    }
}