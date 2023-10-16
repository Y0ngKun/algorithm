class Solution {
    public int solution(String A, String B) {
		if(A.equals(B)) return 0;
        String sb =  new String(A);
        char[] charArr = new char[A.length()];
        
        for (int i = 1; i < A.length(); i++) {
        	for (int j = 1; j <= A.length()-1; j++) {
        		if(j==A.length()-1) {
        			charArr[0]=sb.charAt(sb.length()-1);
        			}
        		charArr[j] = sb.charAt(j-1) ;
        	}
        	sb = String.valueOf(charArr);
        	if(sb.equals(B)) return i;
		}
        return -1;
    }
}