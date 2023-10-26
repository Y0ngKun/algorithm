class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
			for (int j = 0; j < numbers.length; j++) {
				if(numbers[j]== 1 || numbers[j]== 2 || numbers[j]== 3 ||
						numbers[j]== 4 || numbers[j]== 5 || numbers[j]== 6 ||
						numbers[j]== 7 || numbers[j]== 8 || numbers[j]== 9
						) {
					answer-=numbers[j];
				}
			}
        return answer;
    }
}