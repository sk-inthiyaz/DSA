// Linked List:
// 206. Reverse Linked List
// 3550. Smallest Index With Digit Sum Equal to Index
// 100621. Sum of Largest Prime Substrings[biweekly]
// 70. Climbing Stairs (26)
// 556. Next Greater Element III
// 125. Valid Palindrome
// 290. Word Pattern
// 160. Intersection of Two Linked Lists[31/05/25]
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
    // public static class ListNode {
    //     int val;
    //     ListNode next;

    //     ListNode(int val) {
    //         this.val = val;
    //     }
    //     ListNode(int val, ListNode next) {
    //         this.val = val;
    //         this.next = next;
    //     }
    // }

    // // Class with methods to handle the list
    // public static class Solution {
    //     public ListNode reverseList(ListNode head) {
    //         ListNode prev = null;
    //         ListNode curr = head;

    //         while (curr != null) {
    //             ListNode nextNode = curr.next;
    //             curr.next = prev;
    //             prev = curr;
    //             curr = nextNode;
    //         }

    //         return prev;
    //     }
    // }

    // // Utility function to add elements to the list
    // public static ListNode createList(int[] values) {
    //     if (values.length == 0) return null;

    //     ListNode head = new ListNode(values[0]);
    //     ListNode temp = head;
    //     for (int i = 1; i < values.length; i++) {
    //         temp.next = new ListNode(values[i]);
    //         temp = temp.next;
    //     }
    //     return head;
    // }

    // // Utility function to print the list
    // public static void printList(ListNode head) {
    //     ListNode temp = head;
    //     while (temp != null) {
    //         System.out.print(temp.val + " ");
    //         temp = temp.next;
    //     }
    //     System.out.println();
    // }

    // // Main method
    // public static void main(String[] args) {
    //     int[] values = {1, 2, 3, 4, 5}; // Add your elements here

    //     ListNode head = createList(values);
    //     System.out.println("Original List:");
    //     printList(head);

    //     Solution sol = new Solution();
    //     ListNode reversed = sol.reverseList(head);

    //     System.out.println("Reversed List:");
    //     printList(reversed);
    // }
 
//// 3550. Smallest Index With Digit Sum Equal to Index
/*
You are given an integer array nums.

Return the smallest index i such that the sum of the digits of nums[i] is equal to i.

If no such index exists, return -1.

 

Example 1:

Input: nums = [1,3,2]

Output: 2

Explanation:

For nums[2] = 2, the sum of digits is 2, which is equal to index i = 2. Thus, the output is 2.
Example 2:

Input: nums = [1,10,11]

Output: 1

Explanation:

For nums[1] = 10, the sum of digits is 1 + 0 = 1, which is equal to index i = 1.
For nums[2] = 11, the sum of digits is 1 + 1 = 2, which is equal to index i = 2.
Since index 1 is the smallest, the output is 1.
Example 3:

Input: nums = [1,2,3]

Output: -1

Explanation:

Since no index satisfies the condition, the output is -1.
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 1000
//  */
//         public static int digitSum(int p,int digit){
//         if(digit==0){
//             System.out.println(p);
//             return p;
//         }
//         int n = digit%10;
//         p = p + n;
//         n = digit/10;
//         return digitSum(p,n);
//     }
//     public static int smallestIndex(int[] nums) {
//         int small,smallest=-1;
//         for(int i=0;i<nums.length;i++){
//             int sumdigits=digitSum(0,nums[i]);
//             if(sumdigits==i){
//                     smallest=i;
//                     break;
//             }
//         }
//         System.out.println(smallest);
//         return smallest;
//     }
//     public static void main(String[] args) {
//         int k = smallestIndex(new int[]{1,2,3});
//     }




//100621. Sum of Largest Prime Substrings

// public static boolean  isPrime(long  n){
//     // 1. Handle base cases and trivial non-primes
//         if (n <= 1) {
//             return false; // Numbers less than or equal to 1 are not prime
//         }
//         if (n == 2 || n == 3) {
//             return true; // 2 and 3 are prime numbers
//         }
//         if (n % 2 == 0 || n % 3 == 0) {
//             return false; // Multiples of 2 or 3 (except 2 and 3 themselves) are not prime
//         }

//         // 2. Optimized loop for checking divisibility
//         // We only need to check divisors up to the square root of n.
//         // We can skip multiples of 2 and 3 by checking divisors of the form 6k ± 1.
//         for (long i = 5; i * i <= n; i = i + 6) {
//             if (n % i == 0 || n % (i + 2) == 0) {
//                 return false; // n is divisible by i or i+2, so it's not prime
//             }
//         }

//         // 3. If no divisors found, the number is prime
//         return true;
// }

// public static  long sumOfLargestPrimes(String s) {
//         ArrayList list = new ArrayList<>();
//         int n = s.length();
//         long num;
//         for(int i=0;i<=n;i++){
//             for(int j=i;j<=n;j++){
//                 num = Long.parseLong(s.substring(i,j));
//                 if(isPrime(num)){
//                     list.add(num);
//                 }
//             } 
//         }
//         Collections.sort(list,Collections.reverseOrder());
//         Set<Long> myHashSet = new HashSet<>(list);
//         List<Long> mylist = new ArrayList<>(myHashSet);
//         long sum = 0;
//         for(int i=0;i<3;i++){
//             sum += mylist.get(i);
//         }
//         System.out.println(sum);
//         return 0;
//     }


//     public static void main(String[] args) {
//     long g = sumOfLargestPrimes("12234");
// }

/*
// 70. Climbing Stairs (26)
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */
// public int climbStairs(int n) {
//         if (n <= 2) return n;

//         int first = 1;
//         int second = 2;
        
//         for (int i = 3; i <= n; i++) {
//             int third = first + second;
//             first = second;
//             second = third;
//         }
        
//         return second;
//     }





// public  static int nextGreaterElement(int n) {
//         char[] digits = String.valueOf(n).toCharArray();
//         int i = digits.length - 2;



//         //Find the first decreasing digit from the right
//         while (i >= 0 && digits[i] >= digits[i + 1]) {
//             System.out.println(digits[i]+" " +digits[i+1]);
//             i--;
//         }

//         if (i < 0) return -1; // Already the highest permutation

//         // Step 2: Find the digit just larger than digits[i] to the right
//         int j = digits.length - 1;
//         while (digits[j] <= digits[i]) {
//             j--;
//         }

//         // Step 3: Swap
//         char temp = digits[i];
//         digits[i] = digits[j];
//         digits[j] = temp;

//         // Step 4: Reverse the part after i
//         int left = i + 1, right = digits.length - 1;
//         while (left < right) {
//             temp = digits[left];
//             digits[left] = digits[right];
//             digits[right] = temp;
//             left++;
//             right--;
//         }

//         long result = Long.parseLong(new String(digits));
//         return (result <= Integer.MAX_VALUE) ? (int) result : -1;
//     }



//     public static void main(String[] args) {
//         int n = nextGreaterElement(1234);
//     }

    /*
     A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
     */



    //  public static  boolean isPalindrome(String s) {
    //     String onlyLetters = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
    //     int l = 0;
    //     int r = onlyLetters.length() - 1;

    //     while (l < r) {
    //         if (onlyLetters.charAt(l) != onlyLetters.charAt(r)) {
    //             return false;
    //         }
    //         l++;
    //         r--;
    //     }

    //     return true;
    // }
    // public static void main(String[] args) {
    //     // boolean g = isPalindrome("A man, a plan, a canal: Panama");
    //     // boolean g = isPalindrome("race a car");
    //     boolean g = isPalindrome("0p");
    //     System.out.println(g);
    // }

    //290. Word Pattern
    /*
    Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.
 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"

Output: true

Explanation:

The bijection can be established as:

'a' maps to "dog".
'b' maps to "cat".
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"

Output: false

Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"

Output: false
     */





//     public boolean wordPattern(String pattern, String s) {
//         String[] words = s.split(" ");
//         if (pattern.length() != words.length) return false;

//         Map<Character, String> charToWord = new HashMap<>();
//         Map<String, Character> wordToChar = new HashMap<>();

//         for (int i = 0; i < pattern.length(); i++) {
//             char c = pattern.charAt(i);
//             String word = words[i];

//             if (charToWord.containsKey(c)) {
//                 if (!charToWord.get(c).equals(word)) return false;
//             } else {
//                 charToWord.put(c, word);
//             }

//             if (wordToChar.containsKey(word)) {
//                 if (wordToChar.get(word) != c) return false;
//             } else {
//                 wordToChar.put(word, c);
//             }
//         }

//         return true;
    
// }


//1290. Convert Binary Number in a Linked List to Integer
/*
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
Return the decimal value of the number in the linked list.
The most significant bit is at the head of the linked list.
Example 1:
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:
Input: head = [0]
Output: 0
Constraints:
The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.
 */
// public int getDecimalValue(ListNode head) {
//         ArrayList<Integer>arr = new ArrayList<>();
//         ListNode temp = head;
//         while(temp!=null){
//             arr.add(temp.val);
//             temp=temp.next;
//         }
//         int power=0;
//         int convertSum=0;
//         for(int i=arr.size()-1;i>=0;i--){
//             int index=arr.get(i)*(int)Math.pow(2,power);
//             convertSum=convertSum+index;
//             power+=1;
//         }
//         return convertSum;
//     }




// 160. Intersection of Two Linked Lists
/*
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1:


The test cases are generated such that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.

Custom Judge:

The inputs to the judge are given as follows (your program is not given these inputs):

intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
listA - The first linked list.
listB - The second linked list.
skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.

 

Example 1:


Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
- Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.
Example 2:


Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Intersected at '2'
Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
Example 3:


Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: No intersection
Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.
 

Constraints:

The number of nodes of listA is in the m.
The number of nodes of listB is in the n.
1 <= m, n <= 3 * 104
1 <= Node.val <= 105
0 <= skipA <= m
0 <= skipB <= n
intersectVal is 0 if listA and listB do not intersect.
intersectVal == listA[skipA] == listB[skipB] if listA and listB intersect.
 */


// Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static class Solution {
        public int getListLength(ListNode head) {
            int len = 0;
            while (head != null) {
                len++;
                head = head.next;
            }
            return len;
        }

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lenA = getListLength(headA);
            int lenB = getListLength(headB);
            while (lenA > lenB) {
                lenA--;
                headA = headA.next;
            }
            while (lenB > lenA) {
                lenB--;
                headB = headB.next;
            }
            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
        }
    }

    public static void main(String[] args) {
        // Create intersecting linked lists:
        // A: 1 -> 2 \
        //             -> 3 -> 4 -> 5
        // B:     6  /

        ListNode common = new ListNode(3);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = common;

        ListNode headB = new ListNode(6);
        headB.next = common;

        Solution sol = new Solution();
        ListNode intersection = sol.getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection.");
        }
    }


     
}

