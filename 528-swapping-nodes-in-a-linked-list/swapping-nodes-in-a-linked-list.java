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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;
        for(int i=1;i<k;i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast = fast.next;
        }
        for(int i=1;i<k;i++){
            prev = prev.next;
        }
        int temp = prev.val;
        prev.val = slow.val;
        slow.val = temp;
        return head;
    }
}