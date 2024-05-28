package linkedLists;

public class ReorderList {
    public static void main(String[] args) {

    }

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode temp = slow;
        ListNode front ;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        ListNode first = head;
        ListNode second = prev;
        while (second.next != null) {
            front = first.next;
            first.next = second;
            first = front;

            front = second.next;
            second.next = first;
            second = front;
        }
    }
}
