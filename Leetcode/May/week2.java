// 08-05-2025 [2105. Watering Plants II]
public class week2 {
    //2105. Watering Plants II
    /**
 Medium
Topics
Companies
Hint
Alice and Bob want to water n plants in their garden. The plants are arranged in a row and are labeled from 0 to n - 1 from left to right where the ith plant is located at x = i.

Each plant needs a specific amount of water. Alice and Bob have a watering can each, initially full. They water the plants in the following way:
Alice waters the plants in order from left to right, starting from the 0th plant. Bob waters the plants in order from right to left, starting from the (n - 1)th plant. They begin watering the plants simultaneously.
It takes the same amount of time to water each plant regardless of how much water it needs.
Alice/Bob must water the plant if they have enough in their can to fully water it. Otherwise, they first refill their can (instantaneously) then water the plant.
In case both Alice and Bob reach the same plant, the one with more water currently in his/her watering can should water this plant. If they have the same amount of water, then Alice should water this plant.
Given a 0-indexed integer array plants of n integers, where plants[i] is the amount of water the ith plant needs, and two integers capacityA and capacityB representing the capacities of Alice's and Bob's watering cans respectively, return the number of times they have to refill to water all the plants.
Example 1:
Input: plants = [2,2,3,3], capacityA = 5, capacityB = 5
Output: 1
Explanation:
- Initially, Alice and Bob have 5 units of water each in their watering cans.
- Alice waters plant 0, Bob waters plant 3.
- Alice and Bob now have 3 units and 2 units of water respectively.
- Alice has enough water for plant 1, so she waters it. Bob does not have enough water for plant 2, so he refills his can then waters it.
So, the total number of times they have to refill to water all the plants is 0 + 0 + 1 + 0 = 1.
Example 2:
Input: plants = [2,2,3,3], capacityA = 3, capacityB = 4
Output: 2
Explanation:
- Initially, Alice and Bob have 3 units and 4 units of water in their watering cans respectively.
- Alice waters plant 0, Bob waters plant 3.
- Alice and Bob now have 1 unit of water each, and need to water plants 1 and 2 respectively.
- Since neither of them have enough water for their current plants, they refill their cans and then water the plants.
So, the total number of times they have to refill to water all the plants is 0 + 1 + 1 + 0 = 2.
Example 3:
Input: plants = [5], capacityA = 10, capacityB = 8
Output: 0
Explanation:
- There is only one plant.
- Alice's watering can has 10 units of water, whereas Bob's can has 8 units. Since Alice has more water in her can, she waters this plant.
So, the total number of times they have to refill is 0.
Constraints:
n == plants.length
1 <= n <= 105
1 <= plants[i] <= 106
max(plants[i]) <= capacityA, capacityB <= 109
     */


    //  public static  int minimumRefill(int[] plants, int capacityA, int capacityB) {
    //     int n = plants.length;
    //     int a = capacityA; // store original capacity for refilling
    //     int b = capacityB;
    //     int refills = 0;
        
    //     int left = 0;
    //     int right = n - 1;
        
    //     while (left < right) {
    //         // Person A waters from the left
    //         if (capacityA < plants[left]) {
    //             refills++;
    //             capacityA = a;
    //         }
    //         capacityA -= plants[left];

    //         // Person B waters from the right
    //         if (capacityB < plants[right]) {
    //             refills++;
    //             capacityB = b;
    //         }
    //         capacityB -= plants[right];

    //         left++;
    //         right--;
    //     }

    //     // If there's a middle plant (odd number of plants)
    //     if (left == right) {
    //         // Whichever person has more water will try to water the plant
    //         if (Math.max(capacityA, capacityB) < plants[left]) {
    //             refills++;
    //         }
    //     }

    //     return refills;
    // }
    // public static void main(String[] args) {
    //     // int x = minimumRefill(new int[]{1,2,4,4,5}, 6, 5);
    //     // int x = minimumRefill(new int[]{5}, 10, 8);
    //     // int x = minimumRefill(new int[]{2,2,3,3}, 3, 4);
    //     int x = minimumRefill(new int[]{7,7,7,7,7,7,7}, 8 , 7);
    //     System.out.println(x);
    // }

/**
3541. Find Most Frequent Vowel and Consonant
User Accepted:13664
User Tried:13887
Total Accepted:14555
Total Submissions:16918
Difficulty:Easy
You are given a string s consisting of lowercase English letters ('a' to 'z').

Your task is to:

Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
Find the consonant (all other letters excluding vowels) with the maximum frequency.
Return the sum of the two frequencies.

Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them. If there are no vowels or no consonants in the string, consider their frequency as 0.

The frequency of a letter x is the number of times it occurs in the string.
 

Example 1:

Input: s = "successes"

Output: 6

Explanation:

The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
The output is 2 + 4 = 6.
Example 2:

Input: s = "aeiaeia"

Output: 3

Explanation:

The vowels are: 'a' (frequency 3), 'e' ( frequency 2), 'i' (frequency 2). The maximum frequency is 3.
There are no consonants in s. Hence, maximum consonant frequency = 0.
The output is 3 + 0 = 3.
 

Constraints:

1 <= s.length <= 100
s consists of lowercase English letters only.
 */
// class Solution {
//     public int maxFreqSum(String s) {
//         String vowels = "aeiou";
//         int[] vowelFreq = new int[5]; // For 'a', 'e', 'i', 'o', 'u'
//         int[] consonantFreq = new int[26]; // For 'a' to 'z'

//         // Iterate through each character in the input string 's'
//         for (char c : s.toCharArray()) {
//             // --- Handling Vowels ---
//             if (vowels.contains(String.valueOf(c))) {
//                 // If the current character 'c' is found within the 'vowels' string:
//                 // 1. vowels.indexOf(c): This finds the position (index) of the vowel 'c' within the 'vowels' string.
//                 //    - If c is 'a', indexOf('a') returns 0.
//                 //    - If c is 'e', indexOf('e') returns 1.
//                 //    - And so on.
//                 int vowelIndex = vowels.indexOf(c);

//                 // 2. vowelFreq[vowelIndex]++;: This accesses the element in the 'vowelFreq' array at the index we just found
//                 //    and increments its value by 1. This effectively counts the frequency of that specific vowel.
//                 vowelFreq[vowelIndex] = vowelFreq[vowelIndex] + 1;
//             }
//             // --- Handling Consonants ---
//             else {
//                 // If the current character 'c' is NOT a vowel (it's a consonant):
//                 // 1. c - 'a': This part calculates the 0-based index of the consonant in the alphabet.
//                 //    - In ASCII (and Unicode), lowercase letters are in sequential order.
//                 //    - For example:
//                 //      - 'b' - 'a' will result in 1 (because 'b' is one position after 'a').
//                 //      - 'z' - 'a' will result in 25.
//                 int consonantIndex = c - 'a';

//                 // 2. consonantFreq[consonantIndex]++;: This accesses the element in the 'consonantFreq' array at the calculated index
//                 //    and increments its value by 1. This counts the frequency of that specific consonant.
//                 consonantFreq[consonantIndex] = consonantFreq[consonantIndex] + 1;
//             }
//         }

//         // Find the maximum frequency of a vowel
//         int maxVowelFreq = 0;
//         for (int freq : vowelFreq) {
//             if (freq > maxVowelFreq) {
//                 maxVowelFreq = freq;
//             }
//         }

//         // Find the maximum frequency of a consonant
//         int maxConsonantFreq = 0;
//         for (int i = 0; i < consonantFreq.length; i++) {
//             char letter = (char) ('a' + i);
//             if (!vowels.contains(String.valueOf(letter))) {
//                 if (consonantFreq[i] > maxConsonantFreq) {
//                     maxConsonantFreq = consonantFreq[i];
//                 }
//             }
//         }

//         return maxVowelFreq + maxConsonantFreq;
//     }
// }


// /**
// 3542. Minimum Operations to Convert All Elements to Zero
// User Accepted:3154
// User Tried:8708
// Total Accepted:3317
// Total Submissions:26499
// Difficulty:Medium
// You are given an array nums of size n, consisting of non-negative integers. Your task is to apply some (possibly zero) operations on the array so that all elements become 0.

// In one operation, you can select a subarray [i, j] (where 0 <= i <= j < n) and set all occurrences of the minimum non-negative integer in that subarray to 0.

// Return the minimum number of operations required to make all elements in the array 0.

// A subarray is a contiguous sequence of elements within an array.
 

// Example 1:

// Input: nums = [0,2]

// Output: 1

// Explanation:

// Select the subarray [1,1] (which is [2]), where the minimum non-negative integer is 2. Setting all occurrences of 2 to 0 results in [0,0].
// Thus, the minimum number of operations required is 1.
// Example 2:

// Input: nums = [3,1,2,1]

// Output: 3

// Explanation:

// Select subarray [1,3] (which is [1,2,1]), where the minimum non-negative integer is 1. Setting all occurrences of 1 to 0 results in [3,0,2,0].
// Select subarray [2,2] (which is [2]), where the minimum non-negative integer is 2. Setting all occurrences of 2 to 0 results in [3,0,0,0].
// Select subarray [0,0] (which is [3]), where the minimum non-negative integer is 3. Setting all occurrences of 3 to 0 results in [0,0,0,0].
// Thus, the minimum number of operations required is 3.
// Example 3:

// Input: nums = [1,2,1,2,1,2]

// Output: 4

// Explanation:

// Select subarray [0,5] (which is [1,2,1,2,1,2]), where the minimum non-negative integer is 1. Setting all occurrences of 1 to 0 results in [0,2,0,2,0,2].
// Select subarray [1,1] (which is [2]), where the minimum non-negative integer is 2. Setting all occurrences of 2 to 0 results in [0,0,0,2,0,2].
// Select subarray [3,3] (which is [2]), where the minimum non-negative integer is 2. Setting all occurrences of 2 to 0 results in [0,0,0,0,0,2].
// Select subarray [5,5] (which is [2]), where the minimum non-negative integer is 2. Setting all occurrences of 2 to 0 results in [0,0,0,0,0,0].
// Thus, the minimum number of operations required is 4.
 

// Constraints:

// 1 <= n == nums.length <= 105
// 0 <= nums[i] <= 105
//  */

// public int minimumOperations(int[] nums) {
//         int n = nums.length;
//         if (n == 0) {
//             return 0;
//         }

//         return minOpsHelper(nums, 0, n - 1);
//     }

//     private int minOpsHelper(int[] nums, int start, int end) {
//         if (start > end) {
//             return 0;
//         }

//         int minVal = Integer.MAX_VALUE;
//         for (int i = start; i <= end; i++) {
//             if (nums[i] > 0 && nums[i] < minVal) {
//                 minVal = nums[i];
//             }
//         }

//         if (minVal == Integer.MAX_VALUE) { // All elements in this range are 0
//             return 0;
//         }

//         int operations = 1; // One operation to set all occurrences of minVal to 0

//         int i = start;
//         while (i <= end) {
//             if (nums[i] == minVal) {
//                 i++;
//             } else if (nums[i] > 0) {
//                 // Found a subarray where elements are greater than minVal
//                 int j = i;
//                 while (j <= end && nums[j] > 0 && nums[j] != minVal) {
//                     nums[j] -= minVal; // Simulate the operation by subtracting minVal
//                     j++;
//                 }
//                 operations += minOpsHelper(nums, i, j - 1);
//                 i = j;
//             } else { // nums[i] == 0
//                 i++;
//             }
//         }

//         return operations;
//     }




class Solution {
    /**
     * Given two binary strings a and b, return their sum as a binary string.
     *
     * @param a The first binary string.
     * @param b The second binary string.
     * @return The binary sum of a and b.
     */
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0'; // Subtract '0' to convert char to int
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0'; // Subtract '0' to convert char to int
            }

            result.append(sum % 2); // Append the bit (0 or 1)
            carry = sum / 2;      // Calculate the carry for the next step
        }

        return result.reverse().toString(); // Reverse the result and convert to String
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Testcase 1
        String a1 = "11";
        String b1 = "1";
        String result1 = solution.addBinary(a1, b1);
        System.out.println("Input: a = \"" + a1 + "\", b = \"" + b1 + "\"");
        System.out.println("Output: \"" + result1 + "\" (Expected: \"100\")");

        // Testcase 2
        String a2 = "1010";
        String b2 = "1011";
        String result2 = solution.addBinary(a2, b2);
        System.out.println("Input: a = \"" + a2 + "\", b = \"" + b2 + "\"");
        System.out.println("Output: \"" + result2 + "\" (Expected: \"10101\")");

        // Additional Testcases
        String a3 = "10";
        String b3 = "0";
        String result3 = solution.addBinary(a3, b3);
        System.out.println("Input: a = \"" + a3 + "\", b = \"" + b3 + "\"");
        System.out.println("Output: \"" + result3 + "\" (Expected: \"10\")");

        String a4 = "0";
        String b4 = "0";
        String result4 = solution.addBinary(a4, b4);
        System.out.println("Input: a = \"" + a4 + "\", b = \"" + b4 + "\"");
        System.out.println("Output: \"" + result4 + "\" (Expected: \"0\")");

        String a5 = "1";
        String b5 = "1";
        String result5 = solution.addBinary(a5, b5);
        System.out.println("Input: a = \"" + a5 + "\", b = \"" + b5 + "\"");
        System.out.println("Output: \"" + result5 + "\" (Expected: \"10\")");

        String a6 = "1111";
        String b6 = "1";
        String result6 = solution.addBinary(a6, b6);
        System.out.println("Input: a = \"" + a6 + "\", b = \"" + b6 + "\"");
        System.out.println("Output: \"" + result6 + "\" (Expected: \"10000\")");
    }
}


}
