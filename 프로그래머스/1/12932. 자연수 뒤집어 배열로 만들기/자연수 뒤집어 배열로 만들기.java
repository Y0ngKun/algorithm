import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(long n) {
		int[] answer = {};
		List<Long> list = new ArrayList<Long>();
        for (int i = 0; n > 0; i++) {
			list.add(n%10);
			n = n/=10;
		}
        return list.stream().mapToInt(Long::intValue).toArray();
    }
}