// 1249. Minimum Remove to Make Valid Parentheses [18-06-2025]
// 901. Online Stock Span [20-06-2025]
// Histogram [21-06-25]
// 3085. Minimum Deletions to Make String K-Special [22-06-25]
//2966. Divide Array Into Arrays With Max Difference[23-06-25]
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class week3{
    /*
    1249. Minimum Remove to Make Valid Parentheses
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s of '(' , ')' and lowercase English characters.

Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

Formally, a parentheses string is valid if and only if:

It is the empty string, contains only lowercase characters, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
 

Example 1:

Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
Example 2:

Input: s = "a)b(c)d"
Output: "ab(c)d"
Example 3:

Input: s = "))(("
Output: ""
Explanation: An empty string is also valid.
 

Constraints:

1 <= s.length <= 105
s[i] is either '(' , ')', or lowercase English letter.
     */

    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            }
            else if(c==')'){
                if(count==0) continue;
                count--;
            }
            sb.append(c);
        }
        StringBuilder result = new StringBuilder();
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)=='(' && count-- > 0) continue;
            result.append(sb.charAt(i));
        }

        // sn = sb.toString();
        return result.reverse().toString();
    }


    /*
    901. Online Stock Span
Solved
Medium
Topics
premium lock icon
Companies
Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.

The span of the stock's price in one day is the maximum number of consecutive days (starting from that day and going backward) for which the stock price was less than or equal to the price of that day.

For example, if the prices of the stock in the last four days is [7,2,1,2] and the price of the stock today is 2, then the span of today is 4 because starting from today, the price of the stock was less than or equal 2 for 4 consecutive days.
Also, if the prices of the stock in the last four days is [7,34,1,2] and the price of the stock today is 8, then the span of today is 3 because starting from today, the price of the stock was less than or equal 8 for 3 consecutive days.
Implement the StockSpanner class:

StockSpanner() Initializes the object of the class.
int next(int price) Returns the span of the stock's price given that today's price is price.
 

Example 1:

Input
["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
[[], [100], [80], [60], [70], [60], [75], [85]]
Output
[null, 1, 1, 1, 2, 1, 4, 6]

Explanation
StockSpanner stockSpanner = new StockSpanner();
stockSpanner.next(100); // return 1
stockSpanner.next(80);  // return 1
stockSpanner.next(60);  // return 1
stockSpanner.next(70);  // return 2
stockSpanner.next(60);  // return 1
stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
stockSpanner.next(85);  // return 6
 

Constraints:

1 <= price <= 105
At most 104 calls will be made to next.
*/

/*
class StockSpanner {
    Stack<Integer> stack;//Each Element span,price
    List<Integer> prices;
    public StockSpanner() {
        stack = new Stack<>();
        prices = new ArrayList<>();
    }
    
    public int next(int price) {
        int i = prices.size();
        prices.add(price);
        while(stack.size()>0 && prices.get(stack.peek())<=price){
            stack.pop();
        }
        int span;
        if(stack.size()==0){
            span = i + 1;
        }else{
            span = i - stack.peek();
        }

        stack.push(i);
        return span;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
 

//  3085. Minimum Deletions to Make String K-Special
/*
You are given a string word and an integer k.

We consider word to be k-special if |freq(word[i]) - freq(word[j])| <= k for all indices i and j in the string.

Here, freq(x) denotes the frequency of the character x in word, and |y| denotes the absolute value of y.

Return the minimum number of characters you need to delete to make word k-special.

 

Example 1:

Input: word = "aabcaba", k = 0

Output: 3

Explanation: We can make word 0-special by deleting 2 occurrences of "a" and 1 occurrence of "c". Therefore, word becomes equal to "baba" where freq('a') == freq('b') == 2.

Example 2:

Input: word = "dabdcbdcdcd", k = 2

Output: 2

Explanation: We can make word 2-special by deleting 1 occurrence of "a" and 1 occurrence of "d". Therefore, word becomes equal to "bdcbdcdcd" where freq('b') == 2, freq('c') == 3, and freq('d') == 4.

Example 3:

Input: word = "aaabaaa", k = 2

Output: 1

Explanation: We can make word 2-special by deleting 1 occurrence of "b". Therefore, word becomes equal to "aaaaaa" where each letter's frequency is now uniformly 6.

 

Constraints:

1 <= word.length <= 105
0 <= k <= 105
word consists only of lowercase English letters.
 */
public static  int minimumDeletions(String word, int k) {
        int[] freq = new int[26];

        // Step 1: Frequency count
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
            // System.out.println(freq[c - 'a']);
        }
        for (int i : freq) {
            System.out.print(i+" ");
        }
        // Step 2: Remove 0 frequencies and sort
        List<Integer> list = new ArrayList<>();
        for (int f : freq) {
            if (f > 0) list.add(f);
        }
        Collections.sort(list);

        int n = list.size();
        int minDel = Integer.MAX_VALUE;

        // Step 3: Try every frequency as base frequency
        for (int i = 0; i < n; i++) {
            int base = list.get(i);
            int del = 0;

            // Delete frequencies greater than base + k
            for (int j = 0; j < n; j++) {
                int f = list.get(j);
                if (f > base + k) del += (f - (base + k));
                if (f < base) del += f;
            }

            minDel = Math.min(minDel, del);
        }

        return minDel == Integer.MAX_VALUE ? 0 : minDel;
    }


    // public static void main(String[] args) {
    //     int n = minimumDeletions("aabcaba", 0);
    // }

    /*
    2966. Divide Array Into Arrays With Max Difference
Medium
Topics
premium lock icon
Companies
Hint
You are given an integer array nums of size n where n is a multiple of 3 and a positive integer k.

Divide the array nums into n / 3 arrays of size 3 satisfying the following condition:

The difference between any two elements in one array is less than or equal to k.
Return a 2D array containing the arrays. If it is impossible to satisfy the conditions, return an empty array. And if there are multiple answers, return any of them.

 

Example 1:

Input: nums = [1,3,4,8,7,9,3,5,1], k = 2

Output: [[1,1,3],[3,4,5],[7,8,9]]

Explanation:

The difference between any two elements in each array is less than or equal to 2.

Example 2:

Input: nums = [2,4,2,2,5,2], k = 2

Output: []

Explanation:

Different ways to divide nums into 2 arrays of size 3 are:

[[2,2,2],[2,4,5]] (and its permutations)
[[2,2,4],[2,2,5]] (and its permutations)
Because there are four 2s there will be an array with the elements 2 and 5 no matter how we divide it. since 5 - 2 = 3 > k, the condition is not satisfied and so there is no valid division.

Example 3:

Input: nums = [4,2,9,8,2,12,7,12,10,5,8,5,5,7,9,2,5,11], k = 14

Output: [[2,2,2],[4,5,5],[5,5,7],[7,8,8],[9,9,10],[11,12,12]]

Explanation:

The difference between any two elements in each array is less than or equal to 14.

 

Constraints:

n == nums.length
1 <= n <= 105
n is a multiple of 3
1 <= nums[i] <= 105
     */

public static  int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] result = new int[n/3][3];
        int index = 0;
        for(int i=0;i<n;i+=3){
            if(nums[i+2]-nums[i]>=k){
                return new int[0][0];
            }
            //Fill result group 
            result[index][0] = nums[i];
            result[index][1] = nums[i+1];
            result[index][2] = nums[i+2];
            index++;

        }
        
        return result;
    }

    public static void main(String[] args) {
        int[][] d = divideArray(new int[] {1,23,2}, 9);
    }
}