package linkedLists;

import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;
        while (head.next != null) {
            stack.push(head);
            head = head.next;
        }
        current = head;
        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }
        current.next = null;
        return head;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        ListNode front = null;
        while(temp!=null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }


}
