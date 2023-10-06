class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for(int i = 0, j = 1; j<numbers.length; i++,j++) {
        	
        	if(direction.equals("right")) {
        		answer[j] = numbers[i];
        		answer[0] = numbers[numbers.length-1];
        	}
        	if(direction.equals("left")) {
        		answer[i] = numbers[j];
        		answer[answer.length-1] = numbers[0]; 
        	}
        }
        return answer;
    }
}