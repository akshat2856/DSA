/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(slow==null)return false;
        while(fast.next!=null && slow!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==null)return false;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}