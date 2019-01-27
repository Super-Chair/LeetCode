/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode p1 = l1, p2 = l2;
        // just head node
        ListNode pResult = new ListNode(0);
        ListNode first = pResult;

        int carry = 0;
        while (p1 != null || p2 != null) {
            int sum = carry + (p1 != null ? p1.val : 0) + (p2 != null ? p2.val : 0);
            carry = sum / 10;
            pResult.next = new ListNode(sum % 10);
            pResult = pResult.next;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
            if (p1 == null && p2 == null && carry > 0) {
                pResult.next = new ListNode(carry);
            }
        }
        // return head node's next

        return first.next;
    }
}