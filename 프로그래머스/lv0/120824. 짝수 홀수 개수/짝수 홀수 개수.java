class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int zzak = 0;
        int hole = 0;
    for(int i=0;i<num_list.length;i++){
        if (num_list[i] % 2 ==0 ) zzak ++;
        if(num_list[i] % 2 == 1)hole ++;
        }
        answer[0] = zzak;
        answer[1] = hole;
        return answer;
    }
}