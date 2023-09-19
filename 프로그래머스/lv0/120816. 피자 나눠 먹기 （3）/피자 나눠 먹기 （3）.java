class Solution {
    public int solution(int slice, int n) {
        int answer = (int) ((n%slice == 0)? (int)(n / slice) : (int)((n / slice) +1));
        return answer;
    }
}