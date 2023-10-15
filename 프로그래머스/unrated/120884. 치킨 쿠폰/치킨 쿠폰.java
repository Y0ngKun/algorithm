class Solution {
    public int solution(int chicken) {
		int service = chicken;
		for (int i = 1; i <= chicken; i++) {
			if(i%10==0)chicken++;
		}
        return chicken-service;
    }
}