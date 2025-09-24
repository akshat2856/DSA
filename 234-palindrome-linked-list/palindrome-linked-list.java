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
     public ListNode reverseList(ListNode head) {
     ListNode cur = head;
     ListNode prev = null;
     ListNode after = null;
     while(cur!=null){
        after = cur.next;
        cur.next = prev;
        prev = cur;
        cur = after;
     }   
     return prev;
    }
    public boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while(fast.next!=null && fast.next.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode temp = reverseList(slow.next);
    slow.next = temp;
    ListNode poi1 = head;
    ListNode poi2 = temp;
    while(poi2!=null){
        if(poi1.val!=poi2.val){
            return false;
        }
        poi1 = poi1.next;
        poi2 = poi2.next;
    }
    return true;
    }
}