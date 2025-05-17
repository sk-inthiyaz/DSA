
/**
Week 3
16-04-2025[Count the Number of Good Subarrays(I)](Medium)
18-04-2025[21. Merge Two Sorted Lists(I)]
20-04-2025[121. Best Time to Buy and Sell Stock]
21-04-2025[268. Missing Number,// 485. Max Consecutive Ones]
22-04-2025[2570. Merge Two 2D Arrays by Summing Values Easy]
 */

public class week3 {
/*
2537. Count the Number of Good Subarrays
Medium

Given an integer array nums and an integer k, return the number of good subarrays of nums.
A subarray arr is good if there are at least k pairs of indices (i, j) such that i < j and arr[i] == arr[j].
A subarray is a contiguous non-empty sequence of elements within an array.
Example 1:
Input: nums = [1,1,1,1,1], k = 10
Output: 1
Explanation: The only good subarray is the array nums itself.
Example 2:
Input: nums = [3,1,4,3,2,2,4], k = 2
Output: 4
Explanation: There are 4 different good subarrays:
- [3,1,4,3,2,2] that has 2 pairs.
- [3,1,4,3,2,2,4] that has 3 pairs.
- [1,4,3,2,2,4] that has 2 pairs.
- [4,3,2,2,4] that has 2 pairs.
Topics
Array
Hash Table
Sliding Window
     */



// 21. Merge Two Sorted Lists

     



/**
 * 121. Best Time to Buy and Sell Stock
 You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */
    
//  public  static int maxProfit(int[] prices) {
//      int min=prices[0],k=0;
//      for(int i=0;i<prices.length;i++){
//           if(prices[i]<min){
//                min = prices[i];
//                k=i;
//           }
//      }
//      int max=min;
//      for(int i=k;i<prices.length;i++){
//           if(prices[i]>max){
//                max=prices[i];
//           }
//      }
//      return  (max-min);
//  }

//  public static void main(String[] args) {
//      // int[] a =  {7,1,5,3,6,4};
//      // int[] a =  {7,6,4,3,1};
//      int[] a =  {2,4,1};
//      int z = maxProfit(a);
//      System.out.println(z);
//  }



// 448. Find All Numbers Disappeared in an Array
/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]
*/


// public static  List<Integer> findDisappearedNumbers(int[] nums) {
//         List <Integer> li = new ArrayList<>();
//         Arrays.sort(nums);
//         for (Integer integer : nums) {
//                System.out.print(integer+" ");
//         }
//         System.out.println();
//         for(int i=1;i<nums.length;i++){
//           if(!(nums[i]-nums[i-1]==0 || nums[i]-nums[i-1]==1)){
//                System.out.println(i);
//           }
//         }
//         return  li;
//     }

// public static void main(String[] args) {
//      int nums[] = {4,3,2,7,8,2,3,1};

//      // int nums[] = {1,1};
//      List <Integer> d = findDisappearedNumbers(nums);
// }




/*
268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:
Input: nums = [0,1]
Output: 2
Explanation:
n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation:
n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 */

// public static  int missingNumber(int[] nums) {
//      int sum=0,n=nums.length;
//      for(int i=0;i<nums.length;i++){
//           sum+=nums[i];
//      }
//      int asum = (n * (n+1))/2;
//      int r = asum-sum;
//      System.out.print(r);
//      return 0;
// }

// public static void main(String[] args) {
//      // int nums[] = {9,6,4,2,3,5,7,0,1};
//      // int nums[] = {3,0,1};
//      int nums[] = {0};
//      int n = missingNumber(nums);

// }


// 485. Max Consecutive Ones
/**
Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2
Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/

// public static int findMaxConsecutiveOnes(int[] nums) {
//      int c=0,max=0;
//      for(int i=0;i<nums.length;i++){
//           if(nums[i]==1){
//                c++;
//                if(c>max){
//                     max=c;
//                }
//           }
//           else{
//                c=0;
//           }
//      }   
//      System.out.println(max);
//      return 0;
// }

// public static void main(String[] args) {
//      // int nums[] = {1,1,0,1,1,1};
//      int nums[] = {1,0,1,1,0,1};
//      int n = findMaxConsecutiveOnes(nums);
// }


/*
2570. Merge Two 2D Arrays by Summing Values Easy

You are given two 2D integer arrays nums1 and nums2.
nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
Each array contains unique ids and is sorted in ascending order by id.
Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:
Only ids that appear in at least one of the two arrays should be included in the resulting array.
Each id should be included only once and its value should be the sum of the values of this id in the two arrays. If the id does not exist in one of the two arrays, then assume its value in that array to be 0.
Return the resulting array. The returned array must be sorted in ascending order by id.
Example 1:
Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
Output: [[1,6],[2,3],[3,2],[4,6]]
Explanation: The resulting array contains the following:
- id = 1, the value of this id is 2 + 4 = 6.
- id = 2, the value of this id is 3.
- id = 3, the value of this id is 2.
- id = 4, the value of this id is 5 + 1 = 6.
Example 2:
Input: nums1 = [[2,4],[3,6],[5,5]], nums2 = [[1,3],[4,3]]
Output: [[1,3],[2,4],[3,6],[4,3],[5,5]]
Explanation: There are no common ids, so we just include each id with its value in the resulting list.
Constraints:
1 <= nums1.length, nums2.length <= 200
nums1[i].length == nums2[j].length == 2
1 <= idi, vali <= 1000
Both arrays contain unique ids.
Both arrays are in strictly ascending order by id.
 */

//  public static int[][] mergeArrays(int[][] arr1, int[][] arr2) {
//      ArrayList<int[]>res = new ArrayList<>();
//      int n = arr1.length;
//      int m = arr2.length;
//      int i=0;
//      int j=0;
//      while(i<j){
//           if(arr1[i][0]==arr2[i][0]){
//                res.add(new int[] {arr1[i][0],arr1[i][1]+arr2[j][1]});
//                i++;
//                j++;
//           }
//           else if(arr1[i][0]<arr2[j][0]){
//                res.add(new int[]{arr1[i][0],arr1[i][1]});
//                i++;
//           }
//           else{
//                res.add(new int[]{arr2[j][0],arr2[j][1]});
//                j++;
//           }
//      }
//      while(i<n){
//           res.add(new int[]{arr1[i][0],arr2[i][1]});
//           i++;
//      }
//      while(j<m){
//           res.add(new int[]{arr2[j][0],arr2[j][1]});
//           j++;
//      }
//      int len = res.size();
//      int result[][] = new int[len][2];
//      for(int k=0;k<len;k++){
//           result[k]=res.get(k);
//      }
//      return null;

//  }


// public static void main(String[] args) {
//      int arr1[][] = {{1, 2}, {2, 3}, {4, 5}};
//      int arr2[][] = {{1,4},{3,2},{4,1}};
//      int arr3[][] = mergeArrays(arr1, arr2);
// }




/*
905. Sort Array By Parity Easy
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.
Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:
Input: nums = [0]
Output: [0]
Constraints:
1 <= nums.length <= 5000
0 <= nums[i] <= 5000
 */

//  public  static int[] sortArrayByParity(int[] nums) {
//      int lp =0;
//      int rp=nums.length-1;
//      int temp;
//      while(lp<rp){
//           if(nums[lp]%2!=0){
//                if(nums[rp]%2==0){
//                     temp = nums[rp];
//                     nums[rp]=nums[lp];
//                     nums[lp]=temp;
//                     lp++;
//                     rp--;
//                }
//                else if(nums[rp]%2!=0){
//                     rp--;
//                }
               
//           }
//           else if(nums[lp]%2==0){
//                lp++;
//           }
//      }
//         return nums;
//  }
// public static void main(String[] args) {
//      // int[] arr = sortArrayByParity(new int[]{3,1,2,4});
//      int[] arr = sortArrayByParity(new int[]{0});
//      // int[] arr = sortArrayByParity(new int[]{3,1,2,4,7,9,10});
// }


// 922. Sort Array By Parity II
/*
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
Return any answer array that satisfies this condition.
Example 1:
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:
Input: nums = [2,3]
Output: [2,3]
 */
public static  int[] sortArrayByParityII(int[] nums) {
     int evenIndex = 0, oddIndex = 1;
     int n = nums.length;
 
     while (evenIndex < n && oddIndex < n) {
         if (nums[evenIndex] % 2 == 0) {
             evenIndex += 2;
         } else if (nums[oddIndex] % 2 == 1) {
             oddIndex += 2;
         } else {
             // Swap nums[evenIndex] and nums[oddIndex]
             int temp = nums[evenIndex];
             nums[evenIndex] = nums[oddIndex];
             nums[oddIndex] = temp;
             evenIndex += 2;
             oddIndex += 2;
         }
     }
     return null;       
}
public static void main(String[] args) {
     int[] arr = sortArrayByParityII(new int[] {4,2,5,7,9,11,8,10});
     // int[] arr = sortArrayByParityII(new int[] {3,4});
     // int[] arr = sortArrayByParityII(new int[] {888,505,627,846});
     // int[] arr = sortArrayByParityII(new int[] {4,2,5,7});
}




}