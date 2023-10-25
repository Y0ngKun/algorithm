class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long j=x;
        for (int i = 0; i < answer.length; i++) {
			answer[i] = j;
			j += x;
		}
        return answer;
    }
}