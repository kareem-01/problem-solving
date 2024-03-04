package linkedLists;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {

    }


    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
                if (current.next == null) {
                    break;
                }
            } else {
                current = current.next;
            }
        }
        return head;
    }
}


/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * Input: head = [1,1,2]
 * Output: [1,2]
 *
 *
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 */
