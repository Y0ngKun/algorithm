class Solution {
       public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=num_list.length, j=0; i > 0; i--,j++) {
        	answer[j] = num_list[i-1];
        	System.out.println(answer[j]);
        }
        return answer;
    }
}