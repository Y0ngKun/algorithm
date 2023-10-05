class Solution {
   public String solution(String cipher, int code) {
        String answer = "";
        int copyCode = code;
        char[] ch = cipher.toCharArray();
        for(int k=0; k<ch.length; k++) {
        	if(code>ch.length)break;
        	answer += ch[code-1];
        	code += copyCode;
        }
        return answer;
	}
}