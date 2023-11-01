import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < t.length()-(p.length()-1); i++) {
			list.add(t.substring(i, i+p.length()));
			if(Long.parseLong(list.get(i)) <= Long.parseLong(p)) {
				answer++;
			}
		}
        return answer;
    }
}