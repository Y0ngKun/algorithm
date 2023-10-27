import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Arrays;
class Solution {
    public String solution(String s) {
		char[] sol = s.toCharArray();
		    Arrays.sort(sol);
		    return new StringBuilder(new String(sol)).reverse().toString();
    }
}