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
    public ListNode modifiedList(int[] nums, ListNode head) {
    //     ListNode a = new ListNode(100);
    //     ListNode temp1 = a;
    //     while(head!=null){
    //         if(ispresent(nums,head)){
    //             head = head.next;
    //         }else{
    //             temp1.next = head;
    //             temp1 = temp1.next;
    //             head = head.next; 
    //         }
    //     }
    //     temp1.next = null;
    //    return a.next;
    // }
    // public static boolean ispresent(int[] nums,ListNode head){
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==head.val){
    //             return true;
    //         }
    //     }
    //     return false;


        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (head != null) {
            if (!set.contains(head.val)) { 
                tail.next = head;
                tail = tail.next;
            }
            head = head.next;
        }
        tail.next = null;

        return dummy.next;
    }
}
