class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int[] tmp = new int[right-left+1];
        int count = 0;
        for (int i = left, j = 0; i <= right; i++,j++) {
			tmp[j] = i;
		}
        
        for (int i = 0; i < tmp.length; i++) {
        	count = 0;
			for (int j = 1; j <= tmp[i]; j++) {
				if(tmp[i]%j==0)count++;
			}
			if(count%2==0) {
				answer+=tmp[i];
				}
			else {
				answer-=tmp[i];
			}
		}
        return answer;
    }
}