import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Long> list = new ArrayList<Long>();
        for (int i = 0; n > 0; i++) {
        	list.add(n%10);
        	n/=10;
		}
        answer = Long.parseLong(list.stream().sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining()));
        System.out.println(answer);
        return answer;
    }
}