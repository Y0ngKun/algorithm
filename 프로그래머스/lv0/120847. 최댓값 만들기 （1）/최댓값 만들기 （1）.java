import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int num : numbers) {
        	list.add(num);
        }
        
        Collections.sort(list);
        answer = list.get(list.size()-1) * list.get(list.size()-2) ;
        
        return answer;
    }
}