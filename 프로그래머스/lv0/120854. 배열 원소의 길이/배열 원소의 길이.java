class Solution {
   public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length] ;
        
        for(int i = 0; i < strlist.length; i++) {
        	for(int j=0; j < strlist[i].length(); j++) {
        		answer[i] = strlist[i].length();
        	}
        }
        
        return answer;
    }
}