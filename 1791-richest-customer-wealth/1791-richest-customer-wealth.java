-[]ㄴㅇㄴ
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
