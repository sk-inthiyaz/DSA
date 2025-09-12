import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> Container = new HashMap<>();
        int complement;
        for(int i=0;i<nums.length;i++){
            int currentNum = nums[i];
            complement = target - nums[i];
            if(Container.containsKey(complement)){
                return new int[]{Container.get(complement),i};
            }
            Container.put(currentNum,i);
        }
        throw new IllegalArgumentException("No selection Found");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 8, 15};
        int target = 10;
        int[] result = twoSum(nums, target);
        // Should print "[0, 1]"
        System.out.println(Arrays.toString(result));

        int[] nums2 = {3, 5, 2, 4};
        int target2 = 7;
        int[] result2 = twoSum(nums2, target2);
        // Should print "[0, 3]"
        System.out.println(Arrays.toString(result2));
    }
}