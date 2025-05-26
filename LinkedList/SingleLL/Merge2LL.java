public class Merge2LL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {} // Default constructor

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(); // Dummy node to simplify logic
            ListNode current = dummy;

            // Traverse both lists
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }

            // Attach the remaining part
            if (list1 != null) current.next = list1;
            if (list2 != null) current.next = list2;

            return dummy.next; // Return the merged list starting from next of dummy
        }
    }

    // Utility method to create a linked list from an array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Utility method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        Solution sol = new Solution();
        ListNode merged = sol.mergeTwoLists(list1, list2);

        System.out.println("Merged Linked List:");
        printList(merged);
    }
}
