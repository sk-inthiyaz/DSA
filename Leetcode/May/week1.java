//01-05-2025 [344. Reverse StringEasy]
//02-05-2025 [15. 3Sum]
//03-05-2025 [16. 3Sum Closest]
//04-05-2025 [18. 4Sum]
//05-05-2025 [75. Sort Colors]
//07-05-2025 [reversePrefix]
class week1{
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

//  public  static void reverseString(char[] s) {
//     int start=0;
//     int end=s.length-1;
//     char temp;
//     while(start<end){
//         temp=s[start];
//         s[start]=s[end];
//         s[end]=temp;
//         start++;
//         end--;
//     }
//     for (char c : s) {
//         System.out.print(c+" ");
//     }
// }
// public static void main(String[] args) {
//     reverseString(new char[]{'h','e','l','l','o'});
// }




// 15. 3Sum
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 */

    // public static  List<List<Integer>> threesum(int[] nums){
    //     Arrays.sort(nums);
    //     List<List<Integer>> ans = new ArrayList<>();
    //     HashSet<Long>set = new HashSet<>();
    //     int tar=0;
    //     for(int i=0;i<nums.length;i++){
    //         int ntar = tar-nums[i];
    //         int li = i+1;
    //         int ri = nums.length-1;
    //         while(li<ri){
    //             if(nums[li]+nums[ri]<ntar){
    //                 li++;
    //             }
    //             else if(nums[li]+nums[ri]>ntar){
    //                 ri--;
    //             }
    //             else{
    //                 long hash = getHash(nums[i],nums[li],nums[ri]);
    //                 if(set.contains(hash)==false){
    //                     ans.add(Arrays.asList(nums[i],nums[li],nums[ri]));
    //                     System.out.println(nums[i]+" "+nums[li]+" "+nums[ri]);
    //                     set.add(hash);
    //                 }
    //                 li++;
    //                 ri--;
    //             }
    //         }
    //     }
    //     return null;
    // }

    // public static long getHash(int x,int y,int z){
    //     long hash = x;
    //     hash *= 100000;
    //     hash += y;
    //     hash *= 100000;
    //     hash += z;
    //     return hash;
    // }

    // public static List<List<Integer>> threesum(int[] nums){
    //     List<List<Integer>> res  = new ArrayList<>();
    //     Arrays.sort(nums);
    //     for (int i : nums) {
    //         System.out.print(i+" ");
    //     }
    //     for(int i= 0;i < nums.length; i++){
    //         System.out.println(i);
    //         if (nums[i] > 0){
    //             System.out.println(nums[i]+">0 "+"Break");
    //             break;
    //         }
    //         if (i > 0 && nums[i]==nums[i-1]){
    //             System.out.println(i+">0 && "+nums[i]+"=="+nums[i-1]+" continue");
    //             continue;
    //         }
    //         int left = i+1;
    //         int right = nums.length-1;
    //         int target = -nums[i];
    //         System.out.println("left:"+left+"\n"+"right:"+right+"\ntarget:"+target);
    //         while(left < right){
    //             if(nums[left]+nums[right]>target){
    //                 System.out.println("right--");
    //                 right--;
    //             }else if (nums[left]+nums[right] < target){
    //                 System.out.println("left++");
    //                 left++;
    //             }else{
    //                 List<Integer> tmp = new ArrayList<>(3);
    //                 tmp.add(nums[i]);
    //                 tmp.add(nums[left]);
    //                 tmp.add(nums[right]);
    //                 res.add(tmp);
    //                 while(left < right && nums[left] == nums[left+1]){
    //                     left++;
    //                 }
    //                 left++;
    //                  while(left < right && nums[right] == nums[right-1]){
    //                     right--;
    //                 }
    //                 right--;
    //             }
    //         }
    //     }
    //     for (List<Integer> list : res) {
    //         System.out.println(list);
    //     }
    //     return res;
    // }



    // public static void main(String[] args)throws IOException {
    //     try {
    //         List<List<Integer>> result = threesum(new int[]{-1,0,1,2,-1,-4});
    //     } catch (Exception e) {
    //         // TODO: handle exception
    //         System.out.println(e);
    //     }
       
    // }


    // 16. 3Sum Closest
/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
Constraints:
3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 10
 */
    // public static int threeSumClosest(int[] nums, int target) {
    //     Arrays.sort(nums);
    //     int gap = Integer.MAX_VALUE;
    //     int ngap,sum,res=0;
    //     for(int i=0;i<nums.length-2;i++){
    //         int li=i+1;
    //         int ri=nums.length-1;
    //         while(li<ri){
    //             sum = nums[i]+nums[li]+nums[ri];
    //             if(sum<target){
    //                 ngap=target-sum;
    //                 if(gap>ngap){
    //                     gap=ngap;
    //                     res=sum;
    //                 }
    //                 li++;
    //             }else if(sum>target){
    //                 ngap=sum-target;
    //                 if(gap>ngap){
    //                     gap=ngap;
    //                     res=sum;
    //                 }
    //                 ri--;
    //             }
    //             else{
    //                 return sum;
    //             }
    //         }
    //     }
    //     return res;
    // }

    // public static void main(String[] args) {
    //     int b = threeSumClosest(new int[]{-1,2,1,-4}, 1);
    // }




//18. 4Sum
/**
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.
Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
Constraints:
1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
 */
// public static  List<List<Integer>> fourSum(int[] nums, int target) {
//         List<List<Integer>> res = new ArrayList<>();
//         Arrays.sort(nums);
//         long sum;
//         for(int i=0;i<nums.length-3;i++){
//             if(i>0 && nums[i]==nums[i-1]) continue;
//             for(int j=i+1;j<nums.length-2;j++){
//                 if(j>i+1 && nums[j]==nums[j-1]) continue;
//                 int li = j+1;
//                 int ri = nums.length-1;
//                 while(li<ri){
//                     sum = (long)nums[i]+nums[j]+nums[li]+nums[ri];
//                     if(sum>target){
//                         ri--;
//                     }else if(sum<target){
//                         li++;
//                     }else{
//                         res.add(Arrays.asList(nums[i],nums[j],nums[li],nums[ri]));
//                         while(li<ri && nums[li]==nums[li+1]) li++;
//                         while(li<ri && nums[ri]==nums[ri-1]) ri--;
//                         li++;
//                         ri--;
//                     }
//                 }
//             }
//         }
//         return res;
//     }



/**
75. Sort Colors
Solved
Medium
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
 */
// public  static void sortColors(int[] nums) {
//     int count0 = 0;
//     int count1 = 0;
//     int count2 = 0;
//     for(int i:nums){
//         if(i==0){
//             count0++;
//         }
//         else if(i==1) count1++;
//         else if(i==2) count2++;
//     }
//     for(int i=0;i<nums.length;i++){
//             if(count0!=0){
//                 nums[i]=0;
//                 count0--;
//             }
//             else if(count1!=0){
//                 nums[i]=1;
//                 count1--;
//             }
//             else{
//                 nums[i]=2;
//                 count2--;
//             }
//         }
// }


// reversePrefix
public static String reversePrefix(String word, char ch) {
    char x[] = word.toCharArray();
    int n = word.indexOf(ch);
    int lp=0;
    int rp=n;
    char t;
    while(lp<rp){
        t=x[lp];
        x[lp]=x[rp];
        x[rp]=t;
        lp++;
        rp--;
    }
    String str = new String(x);
    return str;
}

public static void main(String[] args) {
    String b = reversePrefix("abcdefg", 'f');
}




}