class Solution {
     public int solution(int hp) {
    	int a = hp - ((hp/5)*5);
    	int answer = (hp>=5) ? hp/5 : (hp==4) ? 2 :(hp==3) ? 1 : (hp==2) ? 2 : (hp==1) ? 1 : 0;
    	
    	if(hp>5) {
    	switch (a) {
		case 4:
			answer = answer + 2;
			break;
		case 3:
			answer = answer + 1;
			break;
		case 2:
			answer = answer + 2;
			break;
		case 1:
			answer = answer + 1;
			break;
		case 0:
			break;
		}
    	}
    	
        return answer;
    }
}