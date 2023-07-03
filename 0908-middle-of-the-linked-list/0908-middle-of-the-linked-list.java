/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {

        ArrayList<ListNode> arr = new ArrayList<ListNode>();
		int count = 0;
		while(head != null) {
			arr.add(head);
			head = head.next;
			count++;
			System.out.println("arr = "+arr);
			System.out.println("count = "+ count);
		}
		count = count/2;
		return arr.get(count);
        
    }
}