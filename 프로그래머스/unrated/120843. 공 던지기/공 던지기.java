class Solution {
    public int solution(int[] numbers, int k) {
		int answer = 0, i = 0, count =0;

		while(true) {
			if(i==numbers.length-2){
				answer = numbers[i];
				count++;
				i = 0;
				if(count >= k) break;
			}
			if(i==numbers.length-1){
				answer = numbers[i];
				count++;
				i = 1;
				if(count >= k) break;
			}
			else{
				answer = numbers[i];
				++count;
				if(count >= k) break;
				i += 2;
			}
		}
		return answer;
	}
}