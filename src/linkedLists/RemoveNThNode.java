package linkedLists;

import java.util.Stack;

public class RemoveNThNode {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            return head.next;
        }
        stack.peek().next = stack.peek().next.next;

        return head;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        // fast pointer is n steps faster than slow pointer
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // if input n equals to the number of nodes in the LinkedList, remove the first node of the LinkedList
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}
/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
