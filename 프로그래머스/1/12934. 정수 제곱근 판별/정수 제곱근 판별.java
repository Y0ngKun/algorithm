class Solution {
    public long solution(long n) {
        long answer = 1;
        for (long i = 1; i <= n; i++) {
			if(answer*answer==n) {
				answer += 1;
				answer = answer * answer;
				return answer;
			}
			answer++;
		}
        return -1;
    }
}