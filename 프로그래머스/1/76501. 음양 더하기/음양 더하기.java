class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
			if(signs[i]==true) {
				absolutes[i] = absolutes[i] * 1;
			}
			else if(signs[i] == false) {
				absolutes[i] = absolutes[i] * -1;
			}
			answer += absolutes[i];
		}
        return answer;
    }
}