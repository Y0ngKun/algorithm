class Solution {
    public int solution(int n) {
		int answer = 0, count = 1;
		
		for (int j = 1; count <= n; j++) {
			if((j%3==0))continue;
			else if(String.valueOf(j).contains("3")) continue;
			else {
				answer=j; 
				count++;
			}
		}
	
		return answer;
	}
}