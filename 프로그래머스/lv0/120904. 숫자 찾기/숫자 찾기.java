class Solution {
    public int solution(int num, int k) {
		int answer = -1;
		
		String str = num+"";
		str = str.replaceFirst("["+k+"]", "!");
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '!') answer = i+1;
			
		}
		System.out.println(answer);
		return answer;
    }
}