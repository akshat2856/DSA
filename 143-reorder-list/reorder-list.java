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
    public void reorderList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int i = 0;
        int j = list.size()-1;
        while(i <= j){
            list2.add(list.get(i));
            if(i != j){
                list2.add(list.get(j));
            }
            i++;
            j--;
        }
        ListNode temp2 = new ListNode(0);
        ListNode  temp3 = head;
        for(int k=0;k<list2.size();k++){
            temp3.val = list2.get(k);
            temp3 = temp3.next;
        }
       // return temp2.next;
    }
}