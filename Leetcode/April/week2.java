
//Doing hc from 29 This is week 2 
// [Total problems:5,med:1]
/*12-04-2025['Contains Duplicate',Search Insert Position]
  13-04-2023['Defuse the Bomb']
  14-04-2025['Majority Element']
  15-04-2025['Container With Most Water'](medium)
 *217. Contains Duplicate
Easy
Topics
Companies
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109 
 */

class week2{
    // public static boolean containsDuplicate(int[] nums) {
    //     // HashSet <Integer> dub = new HashSet<>();
    //     // for (Integer num : nums) {
    //     //     if(dub.contains(num)){
    //     //         return true;
    //     //     }
    //     //     dub.add(num);
    //     // }
    //     Arrays.sort(nums);
    //     for(int i=1;i<nums.length;i++){
    //         if(nums[i-1]==nums[i]){
    //             return  true;
    //         }
    //     }
    //     return  false;
    // }
    // public static void main(String[] args) {
    //     boolean s = containsDuplicate(new int[]{1, 2, 3, 1});
    //     System.out.println(s);
    // }
    /**
    35. Search Insert Position
    Easy
    Topics
    Companies
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity.
    Example 1:
    Input: nums = [1,3,5,6], target = 5
    Output: 2
    Example 2:
    Input: nums = [1,3,5,6], target = 2
    Output: 1
    Example 3:
    Input: nums = [1,3,5,6], target = 7
    Output: 4
    Constraints:
    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums contains distinct values sorted in ascending order.
    -104 <= target <= 104
*/
    // public static int binarySearch(int[] nums,int target){
    //     int low = 0,mid;
    //     int high = nums.length-1;
    //     while(low<high){
    //         mid=low+high/2;
    //         if((nums[mid]==target) || (nums[low]<target && target<nums[mid])){
    //             return mid;
    //         }
    //         else if(nums[mid]<target){
    //             low = mid+1;
    //         }
    //         else if(nums[mid]>target){
    //             high=mid-1;
    //         }
    //     }
    //     return  -1;
    // }

    // public static  int searchInsert(int[] nums, int target) {
    //     for (int i : nums) {
    //         System.out.print(i+" ");
    //     }
    //     System.out.println("target:"+target);
    //     int low = 0;
    //     int high = nums.length - 1;
    
    //     while (low <= high) {
    //         int mid = low + (high - low) / 2; // Correct mid calculation
    //         System.out.println("low:"+low+" high:"+high);
    //         System.out.println("mid = low + (high - low) / 2;");
    //         System.out.println("mid:"+mid);
    //         if (nums[mid] == target) {
    //             return mid; // Target found
    //         } else if (nums[mid] < target) {
    //             low = mid + 1; // Search right half
    //             System.out.println("low:"+low);
    //         } else {
    //             high = mid - 1; // Search left half
    //             System.out.println("high:"+high);
    //         }
    //     }
    //     System.out.println("low"+low);
    //     return low; // Insert position (where 'low' ends)
    //     }
    //     public static void main(String[] args) {
    //         int s = searchInsert(new int[]{1, 3,5,6},5);

    //         System.out.println(s);
    //     }

    /*
* 1652. Defuse the Bomb
Easy
Topics
Companies
Hint
You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.
To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.
If k > 0, replace the ith number with the sum of the next k numbers.
If k < 0, replace the ith number with the sum of the previous k numbers.
If k == 0, replace the ith number with 0.
As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].
Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!
Example 1:
Input: code = [5,7,1,4], k = 3
Output: [12,10,16,13]
Explanation: Each number is replaced by the sum of the next 3 numbers. The decrypted code is [7+1+4, 1+4+5, 4+5+7, 5+7+1]. Notice that the numbers wrap around.
Example 2:
Input: code = [1,2,3,4], k = 0
Output: [0,0,0,0]
Explanation: When k is zero, the numbers are replaced by 0. 
Example 3:
Input: code = [2,4,9,3], k = -2
Output: [12,5,6,13]
Explanation: The decrypted code is [3+9, 2+3, 4+2, 9+4]. Notice that the numbers wrap around again. If k is negative, the sum is of the previous numbers.
Constraints:
n == code.length
1 <= n <= 100
1 <= code[i] <= 100
-(n - 1) <= k <= n - 1
 */
    // public static  int[] decrypt(int[] code, int k) {
    //     int n=code.length;
    //     int dcode[] = new int[n];
    //     if(k==0){
    //         return dcode;
    //     }
    //     for(int i=0;i<n;i++){
    //         dcode[i]=0;
    //         if(k>0){
    //             for(int j=i+1;j<=i+k;j++){
    //                 dcode[i]+=code[j%n];
    //             }
    //         }
    //         else if(k<0){
    //             for(int j=i-1;j>=i-1-Math.abs(k);j--){
    //                 dcode[i]+=code[(j%n+n)%n];
    //             }
    //         }
    //     }
    //     return dcode;
    // }
    // public static void main(String[] args) {
    //     // int[] myArray = {5,7,1,4};
    //     int[] myArray = {2,4,9,3};
    //     int[] result = decrypt(myArray, 3);
    //     for (int i : result) {
    //         System.out.print(i+" ");
    //     }
    // }

    /*
* 169. Majority Element
Easy
Topics
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
     */


    // public static  int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // for (int i : nums) {
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // int max=0,count=1,majority=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         count+=1;
        //         if(count>max){
        //             max=count;
        //             majority=nums[i];
        //         }
        //     }
        //     else{
        //         count=1;
        //     }
        // }
        // int c=0;
        // for (int i : nums) {
        //     if(i==majority){
        //         c++;
        //     }
        // }
        // if(c>Math.floor(n/2)+1){
        //     return  majority;
        // }
        // if(max==0){
        //     return nums[0];
        // }
        // else{
        //     return  majority;
        // }
    //     int count = 0;
    //     Integer candidate = null;
    //     for (int num : nums) {
    //         if (count == 0) {
    //             candidate = num;
    //         }
    //         count += (num == candidate) ? 1 : -1;
    //     }
        
    //     return candidate;
        
    //  }
    //  public static void main(String[] args) {
    //     // int[] myarray = {1,1,1,2,2,2,2};
    //     // int[] myarray = {0, 0, -1, 0, 2, 0};
    //     int[] myarray = {3, 3, 3, 2, 2, 2};
    //     int a = majorityElement(myarray);
    //     System.out.println(a);
    //  }





    /**
1534. Count Good Triplets
Easy
Topics
Companies
Hint
Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.
A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:
0 <= i < j < k < arr.length
|arr[i] - arr[j]| <= a
|arr[j] - arr[k]| <= b
|arr[i] - arr[k]| <= c
Where |x| denotes the absolute value of x.
Return the number of good triplets.
 */


//  public static int countGoodTriplets(int[] arr, int a, int b, int c) {
//     int i,j,k,count=0,n=arr.length;
//     for(i=0;i<n-3;i++){
//         for(j=i+1;j<n-2;j++){
//             if(Math.abs(arr[i]-arr[j])<=a){
//                 for(k=j+1;k<n-1;k++){
//                     if((Math.abs(arr[j]-arr[k])<=b) && (Math.abs(arr[i]-arr[k])<=c)){
//                         count++;
//                     }
//                 }
//             }    
//         }
//     }
//     return  count;
//  }


//  public static void main(String[] args) {
//     // int[] arr= {3,0,1,1,9,7};
//     // int x = countGoodTriplets(arr, 7, 2, 3);
//     int[] arr= {1,1,2,2,3};
//     int x = countGoodTriplets(arr, 0, 0, 1);
//     System.out.println(x);
//  }

/*
11. Container With Most Water[medium]
Medium
Topics
Companies
Hint
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:
Input: height = [1,1]
Output: 1
Constraints:
n == height.length
2 <= n <= 105
0 <= height[i] <= 104
 */
//{Brute force solution}

// public static int maxArea(int[] height) {
//         int mw=0,n=height.length,w,ht,area;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 w=j-i;
//                 ht=(height[i]>height[j])?height[j]:height[i];//taking min height
//                 area=w*ht;
//                 mw = (mw>area)?mw:area;
//             }
//         }
//         return  mw;

//  }
// public static int maxArea(int[] height) {
//     int mw=0,n=height.length;
//     int leftpointer = 0,rightpointer = n-1;
//     while(leftpointer<rightpointer){
//             int w=rightpointer-leftpointer;
//             int ht=(height[leftpointer]<height[rightpointer])?height[leftpointer]:height[rightpointer];//taking min height
//             int area=w*ht;
//             mw = (mw>area)?mw:area;
//             if(height[leftpointer]<height[rightpointer]){
//                 leftpointer++;
//             }
//             else{
//                 rightpointer--;
//             }
//     }
//     return  mw;
// }
//  public static void main(String[] args) {
//     int x = maxArea(new int[]{1,8,6,2,5,4,8,3,7});
//     System.out.println(x);
//  }

//Jump for week 3






}