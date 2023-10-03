class Solution {
    	public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i=0; i<emergency.length; i++) {
        	int count =0;
        	for(int j=0; j<emergency.length; j++) {
        		if(emergency[i] <= emergency[j]) {
        			count++;
        		}
        		answer[i] = count;
        	}
        }
        return answer;
    }
}