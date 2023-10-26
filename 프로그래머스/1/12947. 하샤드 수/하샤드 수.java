class Solution {
    public boolean solution(int x) {
		int copy = x;
        int tmp = 0;
        while(copy>0) {
        	tmp += (copy%10);
        	copy/=10;
        }
        return x%tmp == 0 ? true : false;
    }
}