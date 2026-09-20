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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode l3 = new ListNode(0);
        ListNode temp = l3;
        while(temp1!=null || temp2!=null){
            int val1 = 0;
            int val2 = 0;
            if(temp1!=null)val1=temp1.val;
            if(temp2!=null)val2=temp2.val;
            int val3 = val1 + val2 + carry;
            l3.next = new ListNode(val3%10);
            carry = val3/10;
            if(temp1!=null)temp1 = temp1.next;
            if(temp2!=null)temp2 = temp2.next;
            l3 = l3.next;
        }
        if(carry!=0)l3.next = new ListNode(carry);
        return temp.next;
    }
}