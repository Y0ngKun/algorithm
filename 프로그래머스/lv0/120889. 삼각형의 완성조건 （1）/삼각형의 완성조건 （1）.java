import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
         Arrays.sort(sides);
	        int answer = (sides[2] < (sides[0] + sides[1])) ? 1 : 2; 
        return answer;
    }
}