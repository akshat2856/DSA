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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode prev = head;
        ListNode curr = head.next;
        int i = 2;
        int min = Integer.MAX_VALUE;
        while(curr.next!=null){
            if(curr.val>prev.val && curr.val>curr.next.val)list.add(i);
            if(curr.val<prev.val && curr.val<curr.next.val)list.add(i);
            prev = prev.next;
            curr = curr.next;
            i++;
        }
        
        if(list.size()<2)return new int[] {-1,-1};
        // else if(list.size()==2)return new int[] {list.get(list.size()-1)-list.get(0),list.get(list.size()-1)-list.get(0)};
        else {
            for(int j=1;j<list.size();j++){
                min = Math.min(min,list.get(j)-list.get(j-1));
            }
             return new int[] {min,list.get(list.size()-1)-list.get(0)};
        }
    }
}