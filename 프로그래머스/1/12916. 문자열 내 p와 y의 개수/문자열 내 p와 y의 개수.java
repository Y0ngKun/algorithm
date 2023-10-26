class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countA = 0, countB = 0;
        s = s.replaceAll("[p|P]", "!");
        s = s.replaceAll("[y|Y]", "*");
        for (int i = 0; i < s.length(); i++) {
			if(String.valueOf(s.charAt(i)).equals("!")) countA++;
			else if(String.valueOf(s.charAt(i)).equals("*")) countB++;
		}
        return countA == countB ? true : false;
    }
}