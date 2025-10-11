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
//          int num1 = linkedListToNumber(l1);
//           int num2 = linkedListToNumber(l2);
// int number = num1 + num2;

//  return numberToLinkedList(number);
 ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
  }
        
    //  public static int linkedListToNumber(ListNode head) {
    //     int num = 0;
    //     while (head != null) {
    //         num = num * 10 + head.val; 
    //         head = head.next;
    //     }
    //     return num;
    // }
    //   public static ListNode numberToLinkedList(int num) {
    //      if (num == 0) return new ListNode(0);
    // ListNode dummy = new ListNode(0);
    // ListNode curr = dummy;
    // while (num > 0) {
    //     curr.next = new ListNode(num % 10);  
    //     num /= 10;                           
    //     curr = curr.next;
    // }
    // return dummy.next;
    // }
