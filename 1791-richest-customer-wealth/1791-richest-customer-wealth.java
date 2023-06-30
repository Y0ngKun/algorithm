/*
1. 2차원 배열을 다루는 것을 기억하자
2. 현재 행의 요소의 합과 이전 요소의 합을 비교 할 때 거의 비슷한 방법으로 Math.max()가 있다!
*/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int comparison = 0;

        for(int i = 0; i < accounts.length ; i++){

            for(int j = 0; j < accounts[i].length ; j++){
                sum += accounts[i][j];
            }
            if(sum > comparison){
                comparison = sum;
            }
            sum = sum - sum;
        }

        return comparison;
        
       
    }
}
