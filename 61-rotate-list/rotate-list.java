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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        if(head==null)return null;

        int size = 1;
        while(temp.next!=null){
            size++;
            temp=temp.next;
            }
            if(size==1)return head;
            if(k==0)return head;
            k = k%size;
            if (k == 0) return head;
        ListNode prev = head;
        for(int i=1;i<size-k;i++){
            prev = prev.next;
        }
        ListNode slow = prev.next;
        prev.next = null;
        temp.next = head;   
        return slow;
    }
}