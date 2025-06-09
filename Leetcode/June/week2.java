import java.util.*;

public class week2 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode sortList(ListNode head) {
        if (head == null) return head;
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        ListNode rtemp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(arr);
        int i = 0;
        while (i < arr.size()) {
            rtemp.val = arr.get(i);
            rtemp = rtemp.next;
            i++;
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: Linked List = [4, 2, 1, 3]
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println("Original List:");
        printList(head);

        head = sortList(head);

        System.out.println("Sorted List:");
        printList(head);
    }
}
