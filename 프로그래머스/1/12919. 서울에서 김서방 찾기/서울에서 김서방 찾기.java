class Solution {
    public String solution(String[] seoul) {
        int count = 0;
        for(String str : seoul) {
        	if(str.equals("Kim")){
        		break;
        	}
        	count++;
        }
        return new String ("김서방은 "+count+"에 있다");
    }
}