class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	count = 0;
        	arr[i] = i+1;
        	for(int j=1; j<=arr[i]; j++) {
        		if(arr[i]%j==0)count++;
        	}
        	if(count>=3)answer++;
        }
        
        return answer;
    }
}