import java.util.stream.Collectors;
import java.util.Collections;
class Solution {
    public String solution(String s) {
		String lower = s.replaceAll("[A-Z]","").chars().boxed().sorted(Collections.reverseOrder()).map(c-> String.valueOf((char)c.intValue())).collect(Collectors.joining());
        String upper = s.replaceAll("[^A-Z]","").chars().boxed().sorted(Collections.reverseOrder()).map(c->String.valueOf((char)c.intValue())).collect(Collectors.joining());
        return lower+upper;
    }
}