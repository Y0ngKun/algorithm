import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] result = new int[numlist.length];
        int[] reverseNumList = Arrays.stream(numlist).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < numlist.length; i++) {
        	answer[i] = Math.abs(numlist[i]-n); 
		}
        
        answer = Arrays.stream(answer).sorted().toArray();
        for (int i = 0; i < numlist.length; i++) {
			for (int j = 0; j < numlist.length; j++) {
				if( Math.abs(reverseNumList[i] - n)  == answer[j] ) {
					result[j] = reverseNumList[i];
					answer[j] = 10001;
					break;
				}
			}
		}

        return result;
    }
}