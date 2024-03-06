package linkedLists;

import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(0);
        ListNode third = new ListNode(1);
        head.next = second;
        second.next = third;
        System.out.println(isPalindrome(head));
    }

//    public static boolean isPalindrome(ListNode head) {
//        if (head == null || head.next == null) return true;
//
//        ListNode fast = head, slow = head;
//        Stack<Integer> stack = new Stack<>();
//
//        // Push the first half of the elements onto the stack
//        // When the loop finishes, slow will be at the middle of the list
//        while (fast != null && fast.next != null) {
//            stack.push(slow.val);
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        // For odd length lists, skip the middle element
//        if (fast != null) {
//            slow = slow.next;
//        }
//
//        // Compare the second half of the list with the stack
//        while (slow != null) {
//            if (stack.isEmpty() || stack.pop() != slow.val) {
//                return false;
//            }
//            slow = slow.next;
//        }
//
//        return true;
//    }
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, prev, temp;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }


}
