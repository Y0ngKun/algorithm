class Solution {
    public String[] solution(String[] quiz) {
		String[][] tmp = new String[quiz.length][] ; 
		String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
			for (int j = 0; j < quiz[i].length(); j++) {
				tmp[i] =(quiz[i].split(" "));
			}
		}
       for (int i = 0; i < tmp.length; i++) {
		for (int j = 1; j < 2; j++) {
			if(tmp[i][j].equals("+")) {
				answer[i] = Integer.parseInt(tmp[i][j-1]) + Integer.parseInt(tmp[i][j+1]) == Integer.parseInt(tmp[i][j+3]) ? "O" : "X"; 
				
			}
			else if(tmp[i][j].equals("-")) {
				answer[i] = Integer.parseInt(tmp[i][j-1]) - Integer.parseInt(tmp[i][j+1]) == Integer.parseInt(tmp[i][j+3]) ? "O" : "X";
			}
		}
	}
        return answer;
    }
}