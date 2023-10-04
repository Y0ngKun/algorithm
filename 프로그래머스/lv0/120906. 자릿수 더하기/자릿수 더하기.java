class Solution {
     public int solution(int n) {
	        int answer = 0;
	        String arr = n +"";
	        System.out.println(arr);
	        for(int i = 0; i < arr.length(); i++ ) {
	        	char tmp = arr.charAt(i);
	        	answer += Integer.parseInt(String.valueOf(tmp));
	        }
	        return answer;
	    }
}