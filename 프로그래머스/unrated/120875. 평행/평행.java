class Solution {
  public int solution(int[][] dots) {
		int answer = 0;

		float gradient_12 = Math.abs((float)(dots[1][1] - (float)dots[0][1] ) / ((float)dots[1][0] - (float)dots[0][0]));
		float gradient_34 = Math.abs(((float)dots[3][1] - (float)dots[2][1]) / ((float)dots[3][0] - (float)dots[2][0]));

		float gradient_13 = Math.abs(((float)dots[2][1] - (float)dots[0][1]) / ((float)dots[2][0] - (float)dots[0][0]));
		float gradient_24 = Math.abs(((float)dots[3][1] - (float)dots[1][1]) / ((float)dots[3][0] - (float)dots[1][0]));

		float gradient_23 = Math.abs(( (float)dots[2][1] - (float)dots[1][1]) / ((float)dots[2][0] - (float)dots[1][0]));
		float gradient_14 = Math.abs(( (float)(dots[3][1]) - ((float)dots[0][1]) ) / ((float) (dots[3][0]) - ((float)dots[0][0])));


		if (gradient_12 == gradient_34 || gradient_23 == gradient_14 || gradient_13 == gradient_24 ) {
			answer = 1;
		}


		return answer;
	}
}