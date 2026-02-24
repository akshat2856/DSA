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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a = new ListNode(100);
        ListNode temp = a;
        ListNode tempA = list1;
        ListNode tempB = list2;
        while(tempA!=null && tempB!=null){
            if(tempA.val<=tempB.val){
                temp.next = tempA;
                tempA = tempA.next;
                temp = temp.next;
            }
            else{
                temp.next = tempB;
                tempB = tempB.next;
                temp = temp.next;
            }
        }
        while(tempA!=null){
            temp.next = tempA;
                tempA = tempA.next;
                temp = temp.next;
        }
        while(tempB!=null){
            temp.next = tempB;
                tempB = tempB.next;
                temp = temp.next;
        }
        return a.next;
    }
}