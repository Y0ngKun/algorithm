import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
		s = s.chars().sorted().mapToObj(c -> (char)c).map(String::valueOf).collect(Collectors.joining());
		for(int i = 0; i < s.length(); i++) {
			for(int j=i+1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					s = s.replaceAll(s.charAt(i)+"", "!");
				}
			}
		}
		s = s.replaceAll("!", "");
		    return s;
    }
}