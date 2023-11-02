class Solution {
    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < sizes.length; i++) {
        	int width = sizes[i][0];
        	int height = sizes[i][1];
			if(sizes[i][0]<sizes[i][1]) {
				sizes[i][0] = height;
				sizes[i][1] = width;
			}
			if(sizes[i][0]>x) x =sizes[i][0];
			if(sizes[i][1]>y) y =sizes[i][1];
		}
        
        return x*y;
    }
}