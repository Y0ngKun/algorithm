import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0, count = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
			if((answer+d[i]) <= budget) {
				answer+=d[i];
				count++;
			}
            else if(answer+d[i]>budget)break;
		}
        return count;
    }
}