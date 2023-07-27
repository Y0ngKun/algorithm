class Solution {
    public int[] twoSum(int[] nums, int target) {

        

        int[] result = new int[2];
			for(int i = 0; i < nums.length; i++) {
				for(int j = 0; j<nums.length; j++) {
					if((nums[i]+nums[j]==target) && !(i==j) &&(i<j)) {
						System.out.println("i는 ="+i+" / j는 = "+j);
						result [0] = i;
						result [1] = j;
						System.out.println(result);
							
					} //if문 끝
				}// inner for 끝
			}//outer for 끝
		return result;
        
    }
}