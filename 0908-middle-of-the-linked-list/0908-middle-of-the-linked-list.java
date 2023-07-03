/*
head의 next을 가져오는 가져오는 방법에서 시간을 너무 날렸다
add하고 head = head.next로 값을 바꾸면 간단했다.........
*/


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
