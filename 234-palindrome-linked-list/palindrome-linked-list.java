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
    public boolean isPalindrome(ListNode head) {
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            prev = prev.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode temp = reverse(slow);
        return isequal(head,temp);
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode aage = null;
        while(curr!=null){
            aage = curr.next;
            curr.next = prev;
            prev = curr;
            curr = aage;
        }
        return prev;
    }
    public boolean isequal(ListNode head,ListNode temp){
        ListNode temp1 = head;
        ListNode temp2 = temp;
        while(temp1!=null && temp2!=null){
            if(temp1.val!=temp2.val)return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
}