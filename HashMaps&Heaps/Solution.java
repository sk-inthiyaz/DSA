import java.util.*;

class Solution {
    // public static int[] twoSum(int[] nums, int target) {
    //     Map<Integer,Integer> Container = new HashMap<>();
    //     int complement;
    //     for(int i=0;i<nums.length;i++){
    //         int currentNum = nums[i];
    //         complement = target - nums[i];
    //         if(Container.containsKey(complement)){
    //             return new int[]{Container.get(complement),i};
    //         }
    //         Container.put(currentNum,i);
    //     }
    //     throw new IllegalArgumentException("No selection Found");
    // }

    // public static void main(String[] args) {
    //     int[] nums = {2, 7, 8, 15};
    //     int target = 10;
    //     int[] result = twoSum(nums, target);
    //     // Should print "[0, 1]"
    //     System.out.println(Arrays.toString(result));

    //     int[] nums2 = {3, 5, 2, 4};
    //     int target2 = 7;
    //     int[] result2 = twoSum(nums2, target2);
    //     // Should print "[0, 3]"
    //     System.out.println(Arrays.toString(result2));
    // }
    public  static void findIntersectionValues(int[] nums1, int[] nums2) {
        int n1 = 0;
        int n2 = 0;
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            hm1.put(nums1[i],hm1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            hm2.put(nums2[i],hm2.getOrDefault(nums2[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:hm1.entrySet()){
            if(hm2.containsKey(entry.getKey()))
            n1 = n1 + entry.getValue();
        }

        for(Map.Entry<Integer,Integer>entry:hm2.entrySet()){
            if(hm1.containsKey(entry.getKey()))
            n2 = n2 + entry.getValue();
        }
        int[] arr = new int[]{n1,n2};
        System.out.println(Arrays.toString(arr));
        return ;
    }
    public static void main(String[] args) {
        int[] nums1 = new int[]{3,4,2,3};
        int[] nums2 = new int[]{1,5};
        findIntersectionValues(nums1, nums2);
    }
}