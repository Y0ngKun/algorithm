import java.util.Arrays;
class Solution {
    
    public int solution(int[] array, int n) {
		
		Arrays.sort(array);
		int answer = array[0];
		int tmp = Math.abs(n-array[0]);
		for(int i = 1; i < array.length; i++) {
			if( Math.abs(n-array[i]) < tmp) {
				tmp = Math.abs(n-array[i]);
				answer = array[i];
				}
			else if (Math.abs(n - array[i]) == tmp && array[i] < answer) {
	            answer = array[i];
	            }
			if(tmp == 0) break;
			
		}
		System.out.println(answer);
		return answer;
    }
}