// Linked List:
// 206. Reverse Linked List

// import java.lang.classfile.components.ClassPrinter.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class week4 {
    // public static class  ListNode {
    //     int val;
    //     ListNode next;
    // }
    // Time Complexity:16ms with swaping techinque

    // private ListNode getNodeAt(ListNode head,int idx){
    //     ListNode temp = head;
    //     for(int i=0;i<idx;i++){
    //         temp = temp.next;
    //     }
    //     return temp;
    // }
    // public ListNode reverseList(ListNode head) {
    //     if(head==null) return null;
    //     int size=0;
    //     ListNode temp = head;
    //     while(temp!=null){
    //         size++;
    //         temp=temp.next;
    //     }
    //     int li=0;
    //     int ri=size-1;
    //     while(li<ri){
    //         ListNode left = getNodeAt(head,li);
    //         ListNode right = getNodeAt(head,ri);
    //         int dummy = left.val;
    //         left.val = right.val;
    //         right.val = dummy;
    //         li++;
    //         ri--;
    //     }
    //     return head;
    // }

    // Definition for singly-linked list node
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Class with methods to handle the list
    public static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            return prev;
        }
    }

    // Utility function to add elements to the list
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode temp = head;
        for (int i = 1; i < values.length; i++) {
            temp.next = new ListNode(values[i]);
            temp = temp.next;
        }
        return head;
    }

    // Utility function to print the list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5}; // Add your elements here

        ListNode head = createList(values);
        System.out.println("Original List:");
        printList(head);

        Solution sol = new Solution();
        ListNode reversed = sol.reverseList(head);

        System.out.println("Reversed List:");
        printList(reversed);
    }
 
}