class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z,"
        		+ "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]", "");
        for(int i = 0; i <my_string.length(); i++) {
        	answer += Integer.parseInt(my_string.charAt(i)+"");
        }
        System.out.println(answer);
        return answer;
    }
}