class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
		ArrayList arr = new ArrayList ();
		int[] maxLength = nums1;
		int[] minLength = nums2;
		
		if(nums1.length < nums2.length) {
			maxLength= nums2;
			minLength= nums1;
			}
				
		for(int i = 0; i<minLength.length; i++) {
			for(int j= 0; j<maxLength.length; j++) {
				if((minLength[i] == maxLength[j]) && (!arr.contains(minLength[i])) ) {
					arr.add(minLength[i]);
				}
			}
		}
		
		int[] answer = new int[arr.size()];
		
		
		
		for(int a = 0; a<arr.size(); a++) {
			answer[a] = (int)arr.get(a);
		}
		System.out.println(answer);

		return answer;
	}
}