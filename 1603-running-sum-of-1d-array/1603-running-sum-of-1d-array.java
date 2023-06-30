/*
leetcode 1번 문제
+=연산자로 누적하고 i번째마다 누적값 대입
*/
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0; 
        for(int i= 0; i < nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
