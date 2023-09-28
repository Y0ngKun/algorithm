class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for(int i = 0; i < numbers.length; i++) {
        	answer[i] = numbers[num1];
        	num1++;
        	if(num1>num2) break;
        }
        return answer;
    }
}