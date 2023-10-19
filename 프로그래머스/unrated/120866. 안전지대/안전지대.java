class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        if(board[0].length == 1 || board.length == 1) {
        	
        	if(board[0].length == 1) { // Y축만 있을 경우
        		try {
					for (int i = 0; i < board.length; i++) {
						if(board[i][0] == 1 ) {
							board[i+1][0] = board[i+1][0] == 1 ? 1:2; 
						}
						if(board[i][0] == 0) answer++; 
					}
					return answer;
				} catch (ArrayIndexOutOfBoundsException e) {
					return answer;
				}
        	}
        	else if( board.length == 1) { //X축만 있을 경우
        		try {
					for (int i = 0; i < board[0].length; i++) {
						if(board[0][i] == 1 ) {
							board[0][i+1] = board[0][i+1] == 1 ? 1:2; 
						}
						if(board[0][i] == 0) answer++; 
					}
					return answer;
				} catch (ArrayIndexOutOfBoundsException e) {
					return answer;
				}
        	}
        }
        
        else if(board[0].length > 1 && board.length > 1) { for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]==1) {
					
					if(i==0) { //최하단 X축
						if(j==0) {
							board[i+1][j] = board[i+1][j] == 1 ? 1:2;
							board[i+1][j+1] = board[i+1][j+1] == 1 ? 1:2;
							board[i][j+1] = board[i][j+1] == 1 ? 1:2;
						} //0,0 처리
						else if(j==board.length-1) {
							board[i][board.length-2] = board[i][board.length-2] == 1 ? 1:2;
							board[i+1][board.length-1] =board[i+1][board.length-1] == 1 ? 1:2;
							board[i+1][board.length-2] = board[i+1][board.length-2] == 1 ? 1:2;
						} //0,4 처리
						else if(j!=0 && j!=board.length-1) {
							board[i][j-1] = board[i][j-1] == 1 ? 1:2; 
							board[i][j+1] = board[i][j+1] == 1 ? 1:2;
							
							board[i+1][j] = board[i+1][j] == 1 ? 1:2;
							
							board[i+1][j-1] = board[i+1][j-1] == 1 ? 1:2;
							board[i+1][j+1] = board[i+1][j+1] == 1 ? 1:2;
						}
					}
					
					else if(j==0) { //왼쪽 끝 Y축
						if(i==board.length-1) {
							board[board.length-2][j] = board[board.length-2][j] == 1 ? 1:2;
							board[board.length-2][j+1] = board[board.length-2][j+1] == 1 ? 1:2;
							board[board.length-1][j+1] = board[board.length-1][j+1] == 1 ? 1:2;
							
						} //4,0처리
						else if(i!=0 && i!=board.length-1) {
							board[i-1][j] = board[i-1][j] == 1 ? 1:2; 
							board[i+1][j] = board[i+1][j] == 1 ? 1:2;
							
							board[i][j+1] = board[i][j+1] == 1 ? 1:2;
							
							board[i+1][j+1] = board[i+1][j+1] == 1 ? 1:2;
							board[i-1][j+1] = board[i-1][j+1] == 1 ? 1:2;
						}
					} 
					
					else if(i==board.length-1) { //최상단 X축
						if(j==board.length-1) {
							board[i-1][j] = board[i-1][j] == 1 ? 1:2; //3,4
							board[i-1][j-1] = board[i-1][j-1] == 1 ? 1:2; //3,3
							board[i][j-1] = board[i][j-1] == 1 ? 1:2; //4,3
						} //4,4처리
						else if(j!=0 && j!=board.length-1) {
							board[i][j-1] = board[i][j-1] == 1 ? 1:2;
							board[i][j+1] = board[i][j+1] == 1 ? 1:2;
									
							board[i-1][j-1] = board[i-1][j-1] == 1 ? 1:2;
							board[i-1][j] = board[i-1][j] == 1 ? 1:2;
							board[i-1][j+1] = board[i-1][j+1] == 1 ? 1:2;
						}
					}
					
					else if(j==board.length-1) { //오른쪽 끝 Y축
						if(i!=0 && i!=board.length-1) {
							board[i+1][j] = board[i+1][j] == 1 ? 1:2;
							board[i-1][j] = board[i-1][j] == 1 ? 1:2;
									
							board[i+1][j-1] = board[i+1][j-1] == 1 ? 1:2;
							board[i][j-1] = board[i][j-1] == 1 ? 1:2;
							board[i-1][j-1] = board[i-1][j-1] == 1 ? 1:2;
							}
						}
					
					else { //나머지 중간일 때
						board[i-1][j-1] = board[i-1][j-1] == 1? 1:2;
						board[i-1][j] = board[i-1][j] == 1? 1:2;
						board[i-1][j+1] = board[i-1][j+1] == 1? 1:2;
						
						board[i+1][j-1] = board[i+1][j-1] == 1? 1:2;
						board[i+1][j] = board[i+1][j] == 1? 1:2;
						board[i+1][j+1] = board[i+1][j+1] == 1? 1:2;
						
						board[i][j-1] = board[i][j-1] == 1? 1:2;
						board[i][j+1] = board[i][j+1] == 1? 1:2;
						
						}
					
					}//end of if
				}//end of 2nd for loop
			} //end of 1st for loop
        } // end of if

        for (int k = 0; k < board.length; k++) {
			for (int k2 = 0; k2 < board.length; k2++) {
				if(board[k][k2] == 0) {
					answer++;
				}
			}
		}
        return answer;
    }
}