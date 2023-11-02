class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strNum = new String[] {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int[] intNum = new int[] {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < strNum.length; j++) {
				if(s.contains(strNum[j])) {
					s = s.replaceFirst(strNum[j], String.valueOf(intNum[j]));
				}
			}
		}
        return Integer.parseInt(s);
    }
}