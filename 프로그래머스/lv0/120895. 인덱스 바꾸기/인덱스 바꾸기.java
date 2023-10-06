class Solution {
    public String solution(String my_string, int num1, int num2) {
		char [] copy = my_string.toCharArray();
		for(int i=0; i<my_string.length(); i++) {
        	if(i==num1) {
        		copy[i] = my_string.charAt(num2);
        	}
        	if(i==num2) {
        		copy[i] = my_string.charAt(num1);
        	}
        }
		String answer = "";
		for(char a : copy) {
			answer += a +"";
		}
        return answer;
    }
}