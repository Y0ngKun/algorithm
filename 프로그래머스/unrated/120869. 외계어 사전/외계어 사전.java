class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int count = 0;
        for(int i=0; i < dic.length; i++ ) {
        	count = 0;
        	for(int j=0; j < spell.length; j++) {
        		if(dic[i].contains(spell[j])) {
        			dic[i] = dic[i].replaceFirst(spell[j], "");
        			count ++;
        		}
        	}
        	if(dic[i].isEmpty() && count == spell.length ) answer++;
        }
        return answer >= 1 ?  1 : 2 ;
    }
}