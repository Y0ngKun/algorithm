class Solution {
    	public int solution(int[] numbers) {
        int answer = 0;
        answer = numbers[0] * numbers[1];
        for(int i =0; i < numbers.length; i++) {
        	for(int j=1; j<numbers.length; j++) {
        		if(i!=j && (numbers[i]*numbers[j] >= answer) )
        			answer = numbers[i]*numbers[j];
        	}
        }
        System.out.println(answer);
        return answer;
    }
}