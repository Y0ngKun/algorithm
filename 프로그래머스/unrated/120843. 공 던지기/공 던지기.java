class Solution {
    public int solution(int[] numbers, int k) {
		int answer = 0;

		int i = 1, count =0 ,j = 0;
		while(true) {
			answer = numbers[j];
			if(count >= k) break;
			i = i+2;
			++count;

			if(i%2==0 && i>numbers.length) {
				answer = numbers[numbers.length-2];
				++count;
				if(count >= k) break;
				j = 0;
			}

			if(i%3==0 && i>=numbers.length) {
				answer = numbers[numbers.length-1];
				++count;
				if(count >= k) break;
				j = 1;
			}
			
		}
		System.out.println(answer);
		return answer;
	}
}