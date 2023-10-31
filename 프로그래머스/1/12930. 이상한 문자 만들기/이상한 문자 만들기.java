class Solution {
    public String solution(String s) {
		String[] tmp = s.split(" ",-1);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<tmp.length;i++){
			for (int j = 0; j < tmp[i].length(); j++) {
				if(j%2==0) {
					sb.append(String.valueOf(tmp[i].charAt(j)).toUpperCase());
				}
				else if(j%2==1) {
					sb.append(String.valueOf(tmp[i].charAt(j)).toLowerCase());
				}
			}
			if(i<tmp.length-1)sb.append(" ");
		}

		return sb.toString();
	}
}