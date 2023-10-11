import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(String s) {
        List<String> list = new ArrayList<String>();
        
        for(String string : s.split(" ")) {
        	list.add(string);
        }
        System.out.println(list);
        for(int i = 1; i < list.size(); i++) {
        	if(list.get(i).equals("Z")) {
        		
        		list.set(i, (Integer.valueOf(list.get(i-1))*-1)+"");
        	}
        }
        return list.stream().mapToInt(Integer::parseInt).sum();
    }
}