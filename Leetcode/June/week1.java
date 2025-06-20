// 876. Middle of the Linked List [01-06-2025]
// Weekly context sun - 8:00 AM    ^
// |->Q1. Partition Array into Two Equal Product Subsets [med]
// |->Q2. Minimum Absolute Difference in Sliding Submatrix
// 141. Linked List Cycle [02-06-2025]
// 234. Palindrome Linked List[03-06-2025]
// 83. Remove Duplicates from Sorted List [04-06-2025]
// date  = [05-06-2025]
// 142. Linked List Cycle II                
// Find length of Loop (Greek for greeks)       ^
// 328. Odd Even Linked List        
// 19. Remove Nth Node From End of List 
// 326. Power of Three
// 342. Power of Four
// [06-06-2025]
// 2095. Delete the Middle Node of a Linked List
// 2. Add Two Numbers [07]
// 2022. Convert 1D Array Into 2D Array
//Linked list  should be covered

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

public class week1 {

    // Function to build linked list from array
    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Function to print linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

//Q1. Partition Array into Two Equal Product Subsets
    /*
    You are given an integer array nums containing distinct positive integers and an integer target.

Determine if you can partition nums into two non-empty disjoint subsets, with each element belonging to exactly one subset, such that the product of the elements in each subset is equal to target.

Return true if such a partition exists and false otherwise.

A subset of an array is a selection of elements of the array.
 

Example 1:

Input: nums = [3,1,6,8,4], target = 24

Output: true

Explanation: The subsets [3, 8] and [1, 6, 4] each have a product of 24. Hence, the output is true.

Example 2:

Input: nums = [2,5,3,7], target = 15
Output: false
Explanation: There is no way to partition nums into two non-empty disjoint subsets such that both subsets have a product of 15. Hence, the output is false.
Constraints:
3 <= nums.length <= 12
1 <= target <= 1015
1 <= nums[i] <= 100
All elements of nums are distinct.©leetcode
    */
    public static  boolean checkEqualPartitions(int[] nums, long target) {
            //1,3,4,6,8 t=24
            //2,3,7,9,10,11,17  t = 34
            Arrays.sort(nums);
            int l = 0;
            int r = nums.length-1;
            long p =1;
            p = p*nums[l]*nums[r];
            while(l<r){
            if(p>target){
                System.out.println(false);
                return false;
            }
            else if(p<target){
                p  = p*nums[l];
                l++;
            }
            else{
                l++;
                r--;
            }
            }
            System.out.println(true);
        return true;
    }

    //Q2. Minimum Absolute Difference in Sliding Submatrix
    /*
    You are given an m x n integer matrix grid and an integer k.

For every contiguous k x k submatrix of grid, compute the minimum absolute difference between any two distinct values within that submatrix.

Return a 2D array ans of size (m - k + 1) x (n - k + 1), where ans[i][j] is the minimum absolute difference in the submatrix whose top-left corner is (i, j) in grid.

Note: If all elements in the submatrix have the same value, the answer will be 0.

A submatrix (x1, y1, x2, y2) is a matrix that is formed by choosing all cells matrix[x][y] where x1 <= x <= x2 and y1 <= y <= y2.
 

Example 1:

Input: grid = [[1,8],[3,-2]], k = 2

Output: [[2]]

Explanation:

There is only one possible k x k submatrix: [[1, 8], [3, -2]].
Distinct values in the submatrix are [1, 8, 3, -2].
The minimum absolute difference in the submatrix is |1 - 3| = 2. Thus, the answer is [[2]].
Example 2:

Input: grid = [[3,-1]], k = 1

Output: [[0,0]]

Explanation:

Both k x k submatrix has only one distinct element.
Thus, the answer is [[0, 0]].
Example 3:

Input: grid = [[1,-2,3],[2,3,5]], k = 2

Output: [[1,2]]

Explanation:

There are two possible k × k submatrix:
Starting at (0, 0): [[1, -2], [2, 3]].
Distinct values in the submatrix are [1, -2, 2, 3].
The minimum absolute difference in the submatrix is |1 - 2| = 1.
Starting at (0, 1): [[-2, 3], [3, 5]].
Distinct values in the submatrix are [-2, 3, 5].
The minimum absolute difference in the submatrix is |3 - 5| = 2.
Thus, the answer is [[1, 2]].
 

Constraints:

1 <= m == grid.length <= 30
1 <= n == grid[i].length <= 30
-105 <= grid[i][j] <= 105
1 <= k <= min(m, n)©leetcode
     */
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m - k + 1][n - k + 1];

        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {
                Set<Integer> set = new HashSet<>();

                // Collect all values in the k x k submatrix
                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        set.add(grid[x][y]);
                    }
                }

                // Convert to list and sort
                List<Integer> list = new ArrayList<>(set);
                Collections.sort(list);

                int minDiff = Integer.MAX_VALUE;

                // If all elements are the same
                if (list.size() <= 1) {
                    minDiff = 0;
                } else {
                    for (int l = 1; l < list.size(); l++) {
                        minDiff = Math.min(minDiff, Math.abs(list.get(l) - list.get(l - 1)));
                    }
                }

                ans[i][j] = minDiff;
            }
        }

        return ans;
    }


    //141. Linked List Cycle
/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
 

Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
 

Follow up: Can you solve it using O(1) (i.e. constant) memory?
 */



    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
// 234. Palindrome Linked List
/*
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 

Follow up: Could you do it in O(n) time and O(1) space?

 */
public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        //1.find middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //2.Reverse Second half
        ListNode secondHalf = reverseList(slow);

        // Step 3: Compare both halves
        ListNode firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;

    }
    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode nexttemp = head.next;
            head.next = prev;
            prev = head;
            head = nexttemp;
        }
        return prev;
    }



//83. Remove Duplicates from Sorted List
/**
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
 
 */

public ListNode deleteDuplicates(ListNode head) {
        // if(head==null) return null;
        // HashSet<Integer> set = new HashSet<>();
        // ListNode current = head;
        // set.add(current.val);
        // while(current.next!=null){
        //     if(set.contains(current.next.val)){
        //         set.add(current.val);
        //         current.next = current.next.next;
        //     }
        //     else{
        //         set.add(current.next.val);
        //         current = current.next;
        //     }
        // }
        // return head;
        ListNode temp = head;
        while (temp != null && temp.next != null)
        {
            if (temp.next.val==temp.val)
            {
                temp.next=temp.next.next;
                continue;
            }
            temp=temp.next;
        }
        return head;
    }


//142. Linked List Cycle II
/*
Medium
Topics
premium lock icon
Companies
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
Example 2:


Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
Example 3:


Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
 

Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
 

Follow up: Can you solve it using O(1) (i.e. constant) memory?
 */


public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(head!=slow){
                    head=head.next;
                    slow=slow.next;
                }
                return slow;
            }
            
        }
        return null;
    }

/*
Find length of Loop
Difficulty: EasyAccuracy: 44.26%Submissions: 258K+Points: 2Average Time: 30m
Given the head of a linked list, determine whether the list contains a loop. If a loop is present, return the number of nodes in the loop, otherwise return 0.

Note: 'c' is the position of the node which is the next pointer of the last node of the linkedlist. If c is 0, then there is no loop.

Examples:

Input: head: 1 → 2 → 3 → 4 → 5, c = 2
Output: 4
Explanation: There exists a loop in the linked list and the length of the loop is 4.

Input: head: 25 → 14 → 19 → 33 → 10 → 21 → 39 → 90 → 58 → 45, c = 4
Output: 7
Explanation: The loop is from 33 to 45. So length of loop is 33 → 10 → 21 → 39 → 90 → 58 → 45 = 7.
The number 33 is connected to the last node of the linkedlist to form the loop because according to the input the 4th node from the beginning(1 based indexing) 
will be connected to the last node in the LinkedList.

 */

    // Function to find the length of a loop in the linked list
    // public int countNodesinLoop(Node head) {
    //     // code here.
    //     Node slow = head;
    //     Node fast = head;
    //     while(fast!=null && fast.next!=null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if(slow == fast){
    //            return countLoopLength(slow);
    //         }
            
    //     }
    //     return 0;
    // }
    // private int countLoopLength(Node NodeInLoop){
    //     int count = 1;
    //     Node temp = NodeInLoop.next;
    //     while(temp!=NodeInLoop){
    //         count++;
    //         temp = temp.next;
    //     }
    //     return count;
        
    // }




// 328. Odd Even Linked List
/*
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
 

Constraints:

The number of nodes in the linked list is in the range [0, 104].
-106 <= Node.val <= 106
 */
public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = even;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }

        odd.next = evenhead;
        return head;
    }

//19. Remove Nth Node From End of List
/*
Medium
Topics
premium lock icon
Companies
Hint
Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 

Follow up: Could you do this in one pass?
 */
public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode firstptr = dummy ;
        ListNode secondptr = dummy ;
        for(int i=0;i<n;i++){
            secondptr = secondptr.next;
        }
        while(secondptr.next!=null){
            firstptr = firstptr.next;
            secondptr = secondptr.next;
        }
        firstptr.next = firstptr.next.next;
        return dummy.next;
    }


/*
326. Power of Three
Solved
Easy
Topics
premium lock icon
Companies
Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

 

Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
Example 2:

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.
Example 3:

Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).
 
 */
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n<=0 || n%3!=0) return false;
        return isPowerOfThree(n/3);
    }


/*
342. Power of Four
Solved
Easy
Topics
premium lock icon
Companies
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.

 

Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true
 

Constraints:

-231 <= n <= 231 - 1
 */
public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n<=0 || n%4!=0) return false;
        return isPowerOfFour(n/4);
    }

// 2095. Delete the Middle Node of a Linked List

    /*
    You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 

Example 1:


Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
Explanation:
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node. 
Example 2:


Input: head = [1,2,3,4]
Output: [1,2,4]
Explanation:
The above figure represents the given linked list.
For n = 4, node 2 with value 3 is the middle node, which is marked in red.
Example 3:


Input: head = [2,1]
Output: [2]
Explanation:
The above figure represents the given linked list.
For n = 2, node 1 with value 1 is the middle node, which is marked in red.
Node 0 with value 2 is the only node remaining after removing node 1.
 

Constraints:

The number of nodes in the list is in the range [1, 105].
1 <= Node.val <= 105
     */

public ListNode deleteMiddle(ListNode head) {
        // 1-2-3-4-5 [1-2-4-5] 3
        // 8-2-1-9 [8-2-9]     1
        if(head==null || head.next==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev  = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }


/*
2. Add Two Numbers
Medium
Topics
premium lock icon
Companies
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int carry = 0 ;
        while(l1!=null || l2!=null){
            int sum = 0 + carry;
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            sum = sum%10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }
        if(carry==1)  ptr.next = new ListNode(1);
        return result.next;

    }

/*
2022. Convert 1D Array Into 2D Array
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using all the elements from original.

The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.

Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible.

 

Example 1:


Input: original = [1,2,3,4], m = 2, n = 2
Output: [[1,2],[3,4]]
Explanation: The constructed 2D array should contain 2 rows and 2 columns.
The first group of n=2 elements in original, [1,2], becomes the first row in the constructed 2D array.
The second group of n=2 elements in original, [3,4], becomes the second row in the constructed 2D array.
Example 2:

Input: original = [1,2,3], m = 1, n = 3
Output: [[1,2,3]]
Explanation: The constructed 2D array should contain 1 row and 3 columns.
Put all three elements in original into the first row of the constructed 2D array.
Example 3:

Input: original = [1,2], m = 1, n = 1
Output: []
Explanation: There are 2 elements in original.
It is impossible to fit 2 elements in a 1x1 2D array, so return an empty 2D array.
 

Constraints:

1 <= original.length <= 5 * 104
1 <= original[i] <= 105
1 <= m, n <= 4 * 104
 */

    public  static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0]; // Return empty 2D array if sizes don’t match
        }
        System.out.println("Positions:");
        int[][] result = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            result[i / n][i % n] = original[i];
            System.out.println(i/n+" "+i%n + "input array in index "+ original[i]);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        return result;
    }


    public static void main(String[] args) {
        // int[] input = {1, 2, 3, 4, 5, 6}; // Change this array to test other cases

        // ListNode head = buildList(input);
        // Solution solution = new Solution();
        // ListNode middle = solution.middleNode(head);

        // System.out.print("Output: ");
        // printList(middle);
        // boolean g = checkEqualPartitions(new int[]{3,1,6,8,4}, 24);
        // boolean g = checkEqualPartitions(new int[]{2,5,3,7}, 15);
        // boolean g = checkEqualPartitions(new int[]{3,21,7}, 21);//3,7,21
        int[][] f = construct2DArray(new int[] {1,2,3,4,5,6}, 2, 3);//2 r 3 c
    }
}
