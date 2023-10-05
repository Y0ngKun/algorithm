import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i : numlist) {
        	if(i%n==0) list.add(i);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}