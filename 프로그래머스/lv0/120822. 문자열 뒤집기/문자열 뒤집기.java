class Solution {
    public String solution(String my_string) {
        String answer = "";
       for(int i = my_string.length() ; i > 0; i--) {
    	   answer += my_string.charAt(i-1);
       }
        System.out.println(answer);
        return answer;
    }
}