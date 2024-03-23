package linkedLists;

import java.util.List;

public class AddTwpNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), current = dummy;
        ListNode p = l1, q = l2;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummy.next;

    }
    private ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2, int carry ) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int sum = carry;
        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }

        ListNode resultNode = new ListNode(sum % 10);
        resultNode.next = addTwoNumbersRecursive(l1, l2, sum / 10);
        return resultNode;
    }
    private ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2) {
        ListNode ln = null;
        if(l1.next!=null && l2.next!=null) ln = addTwoNumbersRecursive(l1.next, l2.next);
        else if (l1.next!=null) ln = l1.next;
        else if (l2.next!=null) ln = l2.next;
        int sum = l1.val + l2.val;
        if (sum/10>0) {
            ln = ln != null ? addTwoNumbersRecursive(new ListNode(sum / 10), ln) : new ListNode(sum / 10);
        }
        return new ListNode(sum%10, ln);
    }
}
/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */
