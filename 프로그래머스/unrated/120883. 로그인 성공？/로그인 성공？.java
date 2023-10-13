class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for (int i = 0; i < db.length; i++) {
			for (int j = 0; j < 1; j++) {
				if(id_pw[0].equals(db[i][j]) && id_pw[1].equals(db[i][j+1]) ) return "login";
				else if(id_pw[0].equals(db[i][j])) {
					if(!id_pw[1].equals(db[i][j+1])) return "wrong pw";
				}
			}
		}
        return answer;
    }
}