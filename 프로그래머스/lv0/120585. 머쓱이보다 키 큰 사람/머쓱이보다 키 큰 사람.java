import java.util.Arrays;
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0, count = array.length-1;
        Arrays.sort(array);
        
        if(array[array.length-1] < height ) return 0;
        
        while(count >= 0) {
        	if(array[count] < height) break;
        	if(array[count] > height ) answer ++; count--;
        }
        System.out.println(answer);
        return answer;
    }
}