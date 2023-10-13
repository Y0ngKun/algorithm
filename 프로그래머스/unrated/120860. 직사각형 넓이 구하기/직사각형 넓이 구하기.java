class Solution {
    public int solution(int[][] dots) {
        int width = 0, height = 0;
        
        int longX = Math.max(dots[0][0], dots[2][0]);
        int shortX = Math.min(dots[0][0], dots[2][0]);
        
        for(int i=shortX; i < longX; i++) {
        	width ++;
        }
        int longY = Math.max(dots[0][1], dots[3][1]);
        int shortY = Math.min(dots[0][1], dots[3][1]);
        
        for(int i=shortY; i < longY; i++) {
        	height++;
        }
        return width*height == 0 ? other(dots) : width*height ;
    }
	private static int other(int[][] dots) {
		int width = 0, height = 0;
        
        int longX = Math.max(dots[0][0], dots[3][0]);
        int shortX = Math.min(dots[0][0], dots[3][0]);
        
        for(int i=shortX; i < longX; i++) {
        	width ++;
        }
        int longY = Math.max(dots[0][1], dots[1][1]);
        int shortY = Math.min(dots[0][1], dots[1][1]);
        
        for(int i=shortY; i < longY; i++) {
        	height++;
        }
		return width*height;
	}
}