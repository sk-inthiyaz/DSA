//148. Sort List [09-06-2025]
//382. Linked List Random Node [10-06-25]
//20. Valid Parentheses [11-06-2025]
//1614. Maximum Nesting Depth of the Parentheses[12-06-25]
//3423. Maximum Difference Between Adjacent Elements in a Circular Array[12-06-25]
//232. Implement Queue using Stacks[13-06-25]
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

/*
382. Linked List Random Node
Solved
Medium
Topics
premium lock icon
Companies
Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

Implement the Solution class:

Solution(ListNode head) Initializes the object with the head of the singly-linked list head.
int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be chosen.
 

Example 1:


Input
["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
[[[1, 2, 3]], [], [], [], [], []]
Output
[null, 1, 3, 2, 2, 3]

Explanation
Solution solution = new Solution([1, 2, 3]);
solution.getRandom(); // return 1
solution.getRandom(); // return 3
solution.getRandom(); // return 2
solution.getRandom(); // return 2
solution.getRandom(); // return 3
// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
 

Constraints:

The number of nodes in the linked list will be in the range [1, 104].
-104 <= Node.val <= 104
At most 104 calls will be made to getRandom.
 

Follow up:

What if the linked list is extremely large and its length is unknown to you?
Could you solve this efficiently without using extra space?
 */
//Time:O(n) 
    //space:O(1)
    ArrayList<Integer> arr = new ArrayList<>();
    //O(n) t
    //O(n) s
    public week2(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
    }
    // O(1)
    public int getRandom() {
        // int n = arr.size();
        // int random_index = (int)
        return arr.get((int)(Math.random() * arr.size()));
    }

/*
20. Valid Parentheses
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true
 */
    public boolean isValid(String s) {
        /**
        Input: s = "()[]{}"
Output: true
Input: s = "([])"
Output: true
         */
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!((c == ')' && top == '(') || 
                      (c == '}' && top == '{') || 
                      (c == ']' && top == '['))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

/*
1614. Maximum Nesting Depth of the Parentheses
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

 

Example 1:

Input: s = "(1+(2*3)+((8)/4))+1"

Output: 3

Explanation:

Digit 8 is inside of 3 nested parentheses in the string.

Example 2:

Input: s = "(1)+((2))+(((3)))"

Output: 3

Explanation:

Digit 3 is inside of 3 nested parentheses in the string.

Example 3:

Input: s = "()(())((()()))"

Output: 3

 

Constraints:

1 <= s.length <= 100
s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
It is guaranteed that parentheses expression s is a VPS.

 */

public int maxDepth(String s) {
        int count = 0;
        int max=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else if(c==')'){
                count--;
            }
        }
        return max;     
    }

    /*
    3423. Maximum Difference Between Adjacent Elements in a Circular Array
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given a circular array nums, find the maximum absolute difference between adjacent elements.

Note: In a circular array, the first and last elements are adjacent.

 

Example 1:

Input: nums = [1,2,4]

Output: 3

Explanation:

Because nums is circular, nums[0] and nums[2] are adjacent. They have the maximum absolute difference of |4 - 1| = 3.

Example 2:

Input: nums = [-5,-10,-5]

Output: 5

Explanation:

The adjacent elements nums[0] and nums[1] have the maximum absolute difference of |-5 - (-10)| = 5.

 

Constraints:

2 <= nums.length <= 100
-100 <= nums[i] <= 100
     */

    public int maxAdjacentDistance(int[] nums) {
        int max = 0;
        int d;
        for(int i=1;i<nums.length;i++){
            d = nums[i]-nums[i-1];
            d = Math.abs(d);
            if(d>max){
                max=d;
            }
        }
        d = Math.abs(nums[nums.length-1]-nums[0]);
        if(d>max) max=d;
        return max;
    }

    /*
232. Implement Queue using Stacks
Solved
Easy
Topics
premium lock icon
Companies
Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
Notes:

You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 

Example 1:

Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false
     */

    class MyQueue {
    //paile 2 stak Define kare 
    private Stack<Integer>first;
    private Stack<Integer>second;
    public MyQueue() {
        //2 stacks are created 
        first = new Stack<>();
        second = new Stack<>();
    }
    
    public void push(int x) {
        //first stack me push karrey
        first.push(x);
    }
    
    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    
    public int peek() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return peeked;
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
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
