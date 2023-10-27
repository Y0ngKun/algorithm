import java.math.BigInteger;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).intValue();
        answer[1] = (n*m) / answer[0];
        return answer;
    }
}