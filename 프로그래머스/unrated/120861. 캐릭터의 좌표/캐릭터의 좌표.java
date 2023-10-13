class Solution {
     public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int up = board[1] /2;
        int down = board[1] /2 * -1;
        int left =  board[0] / 2 * -1;
        int right = board[0] / 2;
        
        for(String kk : keyinput ) {
        	if(kk.equals("right")) {
        		if(answer[0] >= right) continue;
        		answer[0]++;
        	}
        	else if(kk.equals("left")) {
        		if(answer[0] <= left) continue;
        		answer[0]--;
        	}
        	else if(kk.equals("up")) {
        		if(answer[1] >= up) continue;
        		answer[1]++;
        	}
        	else {
        		if(answer[1] <= down) continue;
        		answer[1]--;
        	}
        }
        
        return answer;
    }
}