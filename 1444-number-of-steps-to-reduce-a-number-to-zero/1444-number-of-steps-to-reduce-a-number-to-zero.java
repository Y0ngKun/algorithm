class Solution {
    public int numberOfSteps(int num) {
        int count = num;
        int result = 0;

        for (int i = 1; i < num; i++) {
            if (count % 2 == 0) {
                count = count / 2;
                ++result;
            }
            if (!(count % 2 == 0)) {
                count = count - 1;
                ++result;
            }
            if(count==0){
                break;
            }

        }
        return result;
    }
}