class Solution {
    public int[] solution(int n) {
        int z =0;
        if(n%2==0){z = n/2;}
        else{z = (n/2) + 1;}
        
        int[] answer = new int[z];
        
        for(int i =0,j =1; i < n ; i++, j +=2){
            if(j > n)break;
            answer[i] = j;
}
        
        return answer;
    }
}