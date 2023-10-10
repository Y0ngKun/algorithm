import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        char[] aa = before.toCharArray();
        char[] bb = after.toCharArray();
		Arrays.sort(aa);
		Arrays.sort(bb);
		int cc = 0;
		for(int i = 0; i < aa.length; i++) {
			if(aa[i] == bb[i]) cc++;
		}
        
        return (cc==aa.length)? 1: 0;
    }
}