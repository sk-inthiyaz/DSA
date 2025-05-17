//24-04-2025[2149. Rearrange Array Elements by Sign]
//27-04-2025[2161. Partition Array According to Given Pivot]
//28-04-2025[189. Rotate Array]
//29-04-2025[2460. Apply Operations to an Array Easy]
//30-04-2025[// 2200. Find All K-Distant Indices in an Array]
public class week4 {
    //2149. Rearrange Array Elements by Sign  [2161. Partition Array According to Given Pivot]
    /*
    Medium
You are givena 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
You should return the array of nums such that the the array follows the given conditions:
Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
Example 1:
Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
Example 2:
Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].
Constraints:
2 <= nums.length <= 2 * 105
nums.length is even
1 <= |nums[i]| <= 105
nums consists of equal number of positive and negative integers.
     */
    // public static  int[] rearrangeArray(int[] nums) {
    //     int n = nums.length;
    //     int pos=0;
    //     int neg=1;
    //     int[] result = new int[n];
    //     for (int i : nums) {
    //         if(i>0){
    //             result[pos]=nums[i];
    //             pos+=2;
    //         }
    //         else{
    //             result[neg]=nums[i];
    //             neg+=2;
    //         }
    //     }
    //     return null;
    // }
    // public static void main(String[] args) {
    //     // int arr[] = rearrangeArray(new int[] {3,1,-2,-5,2,-4});
    //     // int arr[] = rearrangeArray(new int[] {-1,1});
    //     // int arr[] = rearrangeArray(new int[] {-3,5,7,-9});
    //     // int arr[] = rearrangeArray(new int[] {2,-1,-5,4});
    //     int arr[] = rearrangeArray(new int[] {-2,-5,1,});

    // }










/*
2161. Partition Array According to Given Pivot
You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:

Every element less than pivot appears before every element greater than pivot.
Every element equal to pivot appears in between the elements less than and greater than pivot.
The relative order of the elements less than pivot and the elements greater than pivot is maintained.
More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj.
Return nums after the rearrangement.

Input: nums = [9,12,5,10,14,3,10], pivot = 10
Output: [9,5,3,10,10,12,14]
Explanation: 
The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
Example 2:
Input: nums = [-3,4,3,2], pivot = 2
Output: [-3,2,4,3]
Explanation:
The element -3 is less than the pivot so it is on the left side of the array.
The elements 4 and 3 are greater than the pivot so they are on the right side of the array.
The relative ordering of the elements less than and greater than pivot is also maintained. [-3] and [4, 3] are the respective orderings.
Constraints:
1 <= nums.length <= 105
-106 <= nums[i] <= 106
pivot equals to an element of nums.
 */


//  public  static int[] pivotArray(int[] nums, int pivot) {
//     //Small
//     int result[] = new int[nums.length];
//         int index=0;
//         for(int i:nums){
//             if(i<pivot){
//                 result[index]=i;
//                 index++;
//             }
//         }
//         for(int i:nums)
//             if(i==pivot)
//                 result[index++]=i;
        
//         for(int i:nums)
//             if(i>pivot)
//                 result[index++]=i;
//         return result;
//  }
//  public static void main(String[] args) {
//     // int k[] = pivotArray(new int[]{9,12,5,10,14,3,10}, 10);
//     int k[] = pivotArray(new int[]{-3,4,3,2}, 2);
//  }




// 189. Rotate Array
/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
Follow up:
Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 */

// public static void rotate(int[] nums, int k) {
//     int l=nums.length,temp0,temp1;
//     k=k%l;
//         while(k>0){
//             temp0=nums[0];
//             nums[0]=nums[l-1];
//             for(int i=1;i<l;i++){
//                 temp1=nums[i];
//                 nums[i]=temp0;
//                 temp0=temp1;
//             }
//             k--;
//         }
//         for (int i : nums) {
//             System.out.print(i+" ");
//         }

//  }

// public static void rotate(int[] nums, int k) {
//     int n = nums.length;
//     k = k % n; // Important: if k > n
//     reverse(nums, 0, n - 1);
//     reverse(nums, 0, k - 1);
//     reverse(nums, k, n - 1);
//     for (int i : nums) {
//         System.out.print(i+" ");
//     }
// }

// private static void reverse(int[] nums, int start, int end) {
//     while (start < end) {
//         int temp = nums[start];
//         nums[start] = nums[end];
//         nums[end] = temp;
//         start++;
//         end--;
//     }
// }


// public static void main(String[] args) {
//     rotate(new int[]{1,2,3,4,5,6,7}, 3);
//     // rotate(new int[]{-1,-100,3,99}, 2);
// }




/*
2460. Apply Operations to an Array Easy
You are given a 0-indexed array nums of size n consisting of non-negative integers.
You need to apply n - 1 operations to this array where, in the ith operation (0-indexed), you will apply the following on the ith element of nums:
If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to 0. Otherwise, you skip this operation.
After performing all the operations, shift all the 0's to the end of the array.
For example, the array [1,0,2,0,0,1] after shifting all its 0's to the end, is [1,2,1,0,0,0].
Return the resulting array.
Note that the operations are applied sequentially, not all at once.
Example 1:
Input: nums = [1,2,2,1,1,0]
Output: [1,4,2,0,0,0]
Explanation: We do the following operations:
- i = 0: nums[0] and nums[1] are not equal, so we skip this operation.
- i = 1: nums[1] and nums[2] are equal, we multiply nums[1] by 2 and change nums[2] to 0. The array becomes [1,4,0,1,1,0].
- i = 2: nums[2] and nums[3] are not equal, so we skip this operation.
- i = 3: nums[3] and nums[4] are equal, we multiply nums[3] by 2 and change nums[4] to 0. The array becomes [1,4,0,2,0,0].
- i = 4: nums[4] and nums[5] are equal, we multiply nums[4] by 2 and change nums[5] to 0. The array becomes [1,4,0,2,0,0].
After that, we shift the 0's to the end, which gives the array [1,4,2,0,0,0].
Example 2:
Input: nums = [0,1]
Output: [1,0]
Explanation: No operation can be applied, we just shift the 0 to the end.
 */

// public static int[] applyOperations(int[] nums) {
//     int n=nums.length,c=0;
//     for(int i=0;i<n-1;i++){
//         if(nums[i]==nums[i+1]){
//             nums[i]=nums[i]*2;
//             nums[i+1]=0;
//         }
//         if(nums[i+1]==0){
//             c++;
//         }
//     }
//     int index=0;

//     for (int num : nums) {
//         if(num!=0){
//             nums[index]=num;
//             index++;
//         }
//     }
//     while(index<nums.length){
//         nums[index]=0;
//         index++;
//     }
//     System.out.println("\n"+c);
//     for (int i : nums) {
//         System.out.print(i+" ");
//     }
//     return null; 
// }
// public static void main(String[] args) {
//     int arr[] = applyOperations(new int[]{1,2,2,1,1,0});
//     // int arr[] = applyOperations(new int[]{1,0,2,0,0,1});
// }




// 2200. Find All K-Distant Indices in an Array
/*
You are given a 0-indexed integer array nums and two integers key and k. A k-distant index is an index i of nums for which there exists at least one index j such that |i - j| <= k and nums[j] == key.
Return a list of all k-distant indices sorted in increasing order.
Example 1:
Input: nums = [3,4,9,1,3,9,5], key = 9, k = 1
Output: [1,2,3,4,5,6]
Explanation: Here, nums[2] == key and nums[5] == key.
- For index 0, |0 - 2| > k and |0 - 5| > k, so there is no j where |0 - j| <= k and nums[j] == key. Thus, 0 is not a k-distant index.
- For index 1, |1 - 2| <= k and nums[2] == key, so 1 is a k-distant index.
- For index 2, |2 - 2| <= k and nums[2] == key, so 2 is a k-distant index.
- For index 3, |3 - 2| <= k and nums[2] == key, so 3 is a k-distant index.
- For index 4, |4 - 5| <= k and nums[5] == key, so 4 is a k-distant index.
- For index 5, |5 - 5| <= k and nums[5] == key, so 5 is a k-distant index.
- For index 6, |6 - 5| <= k and nums[5] == key, so 6 is a k-distant index.
Thus, we return [1,2,3,4,5,6] which is sorted in increasing order. 
Example 2:
Input: nums = [2,2,2,2,2], key = 2, k = 2
Output: [0,1,2,3,4]
Explanation: For all indices i in nums, there exists some index j such that |i - j| <= k and nums[j] == key, so every index is a k-distant index. 
Hence, we return [0,1,2,3,4].
 */


// public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
// 		List <Integer> arr = new ArrayList<>();
// 		int n = nums.length;
// 		for(int i=0;i<n;i++){
// 			System.out.println("i:"+i);
// 			for(int j=i-k;j<=i+k;j++){
// 				System.out.println("j:"+(i-k));
// 				if(j>=0 && j<n && nums[j]==key){
// 					System.out.print("j>=0 && j<n"+n+" nums[j]==key");
// 					arr.add(i);
// 					break;
// 				}
// 				System.out.println();
// 			}
// 		}
// 		for (Integer integer : arr) {
// 			System.out.print(integer+" ");
// 		}
//         return null;
//     }

// public static void main(String[] args) {
// 	List <Integer> a= findKDistantIndices(new int[]{3,4,9,1,3,9,5}, 9, 1);
// }

/*
344. Reverse StringEasy
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
Constraints:
1 <= s.length <= 105
s[i] is a printable ascii character.
 */

public  static void reverseString(char[] s) {
    int start=0;
    int end=s.length-1;
    char temp;
    while(start<end){
        temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        start++;
        end--;
    }
    for (char c : s) {
        System.out.print(c+" ");
    }
}
public static void main(String[] args) {
    reverseString(new char[]{'h','e','l','l','o'});
}





}
