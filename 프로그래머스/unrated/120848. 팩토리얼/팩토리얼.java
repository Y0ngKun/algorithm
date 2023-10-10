class Solution {
    public int solution(int n) {
	        int sum = 1, answer = 0;
	        
	        
	        for(int i = 1; i <= 10; i++) {
	        	sum *= i;
	        	if((sum * (i+1)) > n) {
	        		answer = i;
	        		break;
	        	}
	        }
        return answer;
	    }
}