class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==1) {//length 홀수 일 때
        	return String.valueOf(s.charAt((s.length()/2)));
        }
        if(s.length()%2==0) {//length 짝수 일 때
        	return String.valueOf(s.charAt(s.length()/2-1))+String.valueOf(s.charAt((s.length()/2))) ;
        }
        return answer;
    }
}