class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int count = 0;
        if(num==1) {
        	answer[0]=total;
        	return answer;
        }
        else if(num==2) {
        	answer[0] = total/num;
        	answer[1] = total/num+1;
        }
        else if( (num>=3) && (num%2!=0) ) {
        	for (int i = (total/num) - (num/2); i <= (total/num) + (num/2); i++) {
        		if(count==-num-1)break;
        		answer[count] = i;
				count++;
			}
        }
        else {
        	for (int i = (total/num) - (num/2)+1; i <= (total/num) + (num/2); i++) {
        		if(count==-num-1)break;
        		answer[count] = i;
				count++;
			}
        }
        for(int aa : answer)System.out.println(aa);
        return answer;
    }
}