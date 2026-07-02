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
        if(head==null)return null;
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        k = k%size;
        if(k==0)return head;
        ListNode l1 = head;
        ListNode l2 = head.next;
        for(int i=0;i<size-k-1;i++){
            l1 = l1.next;
            l2 = l2.next;
        }
        l1.next = null;
        ListNode l3 = l2;
        while(l3.next!=null){
            l3 = l3.next;
        }
        l3.next = head;
        return l2;
    }
}