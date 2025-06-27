//26-06-25  = [316.removeDuplicateLetters]
/*
496. Next Greater Element I
Attempted
Easy
Topics
premium lock icon
Companies
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 

Constraints:

1 <= nums1.length <= nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 104
All integers in nums1 and nums2 are unique.
All the integers of nums1 also appear in nums2.
 

Follow up: Could you find an O(nums1.length + nums2.length) solution?

 */


// class week4{
//     public static int[] nge(int[] nums1,int[] nums2){
//         int[] result = new int[nums1.length];
        
//     }
//     public static void main(String[] args) {
        
//     }
// }
/*
 316. Remove Duplicate Letters
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
Example 1:

Input: s = "bcabc"
Output: "abc"
Example 2:

Input: s = "cbacdcbc"
Output: "acdb"
 

Constraints:

1 <= s.length <= 104
s consists of lowercase English letters.
 

Note: This question is the same as 1081: https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/
 */

// import java.util.HashSet;

// public class week4 {
//     public static String removeDuplicates(String str){
//         StringBuilder sb = new StringBuilder();
//         HashSet<Character> hs = new HashSet<>();
//         for(char c:str.toCharArray()){
//             hs.add(c);
//         }
//         for(char c:hs){
//             System.out.print(c);
//         }
//         return "";
//     }
//     public static void main(String[] args) {
//         // String g = removeDuplicates("bcabc");
//         String g = removeDuplicates("cbacdcbc");
//     }
// }



/*
316. Remove Duplicate Letters
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.

 

Example 1:

Input: s = "bcabc"
Output: "abc"
Example 2:

Input: s = "cbacdcbc"
Output: "acdb"
 

Constraints:

1 <= s.length <= 104
s consists of lowercase English letters.
 */

// import java.util.*;
// public class week4{
//     public String removeDuplicateLetters(String s) {
//         Stack<Character> stack = new Stack<>();
//         int freq[] = new int[26];
//         boolean exist[] =new boolean[26];
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             freq[ch-'a']++;
//         }
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             freq[ch-'a']--;
//             if(exist[ch-'a']) continue;
//             while(stack.size()>0 && stack.peek()>ch && freq[stack.peek()-'a']>0){
//                 char rem = stack.pop();
//                 exist[rem-'a'] =false;
//             }
//             stack.push(ch);
//             exist[ch-'a'] =true;
//         }
//         char ans[] = new char[stack.size()];
//         int i=ans.length-1;
//         while(i>=0) ans[i--]=stack.pop();
//         return new String(ans);
//     }
// }

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class week4{
    /*
    496. Next Greater Element I
Solved
Easy
Topics
premium lock icon
Companies
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 

Constraints:

1 <= nums1.length <= nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 104
All integers in nums1 and nums2 are unique.
All the integers of nums1 also appear in nums2.
 

Follow up: Could you find an O(nums1.length + nums2.length) solution?
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums2.length == 0 || nums1.length == 0)
      return new int[0];

    Map<Integer, Integer> numberNGE = new HashMap<>();
    Stack<Integer> numStack = new Stack<>();

    numStack.push(nums2[nums2.length - 1]);
    numberNGE.put(nums2[nums2.length - 1], -1);

    for (int i = nums2.length - 2; i >= 0; i--) {

      if (nums2[i] < numStack.peek()) {
        numberNGE.put(nums2[i], numStack.peek());
        numStack.push(nums2[i]);
        continue;
      }

      while (!numStack.isEmpty() && numStack.peek() < nums2[i])
        numStack.pop();

      if (numStack.isEmpty()) {
        numStack.push(nums2[i]);
        numberNGE.put(nums2[i], -1);
      } else {
        numberNGE.put(nums2[i], numStack.peek());
        numStack.push(nums2[i]);
      }
    }

    for (int i = 0; i < nums1.length; i++)
      nums1[i] = numberNGE.get(nums1[i]);

    return nums1;
    }
}
