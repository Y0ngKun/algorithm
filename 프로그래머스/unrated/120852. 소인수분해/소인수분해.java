import java.util.LinkedList;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 2; i <= n ; i++) {
        	if(n%i ==0) list.add(i);
        }
        for(int k=list.size()-1; k > 0; k--) {
        	for(int j = 0; j < list.size(); j++) {
        		if(list.get(k) % list.get(j) == 0 && k!=j) {
        			list.remove(k);
        			break;
        		}
        	}
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}