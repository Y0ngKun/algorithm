import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[][] score) {
		double[] answer = new double[score.length];
        for(int i = 0; i < score.length; i++) {
        	answer[i] = (score[i][0] + score[i][1])/2.0d;
        }
        for(double jf : answer)System.out.println(jf);
        double[] rankArr = Arrays.stream(answer).boxed().sorted(Collections.reverseOrder()).mapToDouble(Double::doubleValue).toArray();
        for(double jf : rankArr)System.out.println(jf);
        
        for(int k = 0; k < score.length; k++) {
        	for (int z = 0; z < rankArr.length; z++) {
				if(answer[k] == rankArr[z]) {
					answer[k] = z+1;
					break;
				}
			}
        }
        int[] result = Arrays.stream(answer).boxed().mapToInt(Double::intValue).toArray();
        return result;
    }
}