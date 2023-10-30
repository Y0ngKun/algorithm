class Solution {
    public int solution(int n) {
        int answer = 0;
        int three = 1;
        StringBuilder tmp = new StringBuilder();
        while(n>0) {
        	tmp.append(n%3);
        	n/=3;
        }
        System.out.println(tmp);
        for (int i = tmp.length()-1; i >= 0; i--) {
        	answer += Integer.parseInt(String.valueOf(tmp.charAt(i)))*three;
        	three*=3;
		}
        return answer;
    }
}