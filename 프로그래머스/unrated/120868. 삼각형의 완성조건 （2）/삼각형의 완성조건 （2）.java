class Solution {
    public int solution(int[] sides) {
        int big = sides[0] > sides[1] ? sides[0] : sides[1];
        int small = sides[0] > sides[1] ? sides[1] : sides[0];
        int answer = 0;
        for(int i = (big-small)+1 ;i < small+big; i++ ) {
        	answer++;
        }
        
        return answer;
    }
}