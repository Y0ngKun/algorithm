import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
        if(arr.length > 1) {
        	int[] tmp = new int[arr.length];
        	tmp = Arrays.stream(arr).boxed().sorted().mapToInt(Integer::intValue).toArray();
        	int min = tmp[0];
        	for (int i = 0; i < arr.length; i++) {
        		if(arr[i]!=min) {
        			list.add(arr[i]);
        		}
			}
        	return list.stream().mapToInt(Integer::intValue).toArray();
        }
        return new int[] {-1};
    }
}