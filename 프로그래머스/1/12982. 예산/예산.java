import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0, count = 0;
        d = Arrays.stream(d).boxed().sorted().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < d.length; i++) {
			if((answer+d[i]) <= budget) {
				answer+=d[i];
				count++;
			}
		}
        return count;
    }
}