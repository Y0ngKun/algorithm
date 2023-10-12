class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i =0; i < array.length; i++) {
        	for(int j = 0; j < array[i] ; j++) {
        		if(array[i]%10 == 7 ) {
        			answer ++;
        		}
                array[i] /= 10;
        	}
        }
        return answer ;
    }
}