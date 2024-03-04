package linkedLists;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        System.out.println((6 / 2) + 1);

    }

    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        temp = head;

        for (int i = 0; i < (length / 2); i++) {
            temp = temp.next;
        }
        return temp;
    }
}
