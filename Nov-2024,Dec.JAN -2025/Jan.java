
//1.Third maximum Array
/*
 * Test Case 8:

Input: nums = [3, 3, 3, 2, 1]
Output: 1
Explanation: The distinct maximums are 3, 2, and 1.
Test Case 9:

Input: nums = [7, 7, 7, 8, 8, 9]
Output: 7
Explanation: The distinct maximums are 9, 8, and 7.

 */
public class Jan {
        public int thirdMax(int[] nums) { 
            // Initialize the three variables for first, second, and third largest values to Long.MIN_VALUE
            // Long.MIN_VALUE is used to ensure that any number in the array will be larger than these initial values
            long first = Long.MIN_VALUE;
            long second = Long.MIN_VALUE;
            long third = Long.MIN_VALUE;
            int i = 0;
    
            // Iterate through the array to find the top 3 distinct largest numbers
            while (i < nums.length) {
                // Skip the current number if it is already considered for first, second, or third largest
                if (nums[i] == first || nums[i] == second || nums[i] == third) {
                    i++;
                    continue;
                }
    
                // If current number is larger than the first largest, shift the numbers
                if (first < nums[i]) {
                    third = second;  // Move second to third
                    second = first;  // Move first to second
                    first = nums[i]; // Update first to the current number
    
                // If current number is between the first and second largest, update second and third
                } else if (second < nums[i]) {
                    third = second;  // Move second to third
                    second = nums[i]; // Update second to the current number
    
                // If current number is between the second and third largest, update third
                } else if (third < nums[i]) {
                    third = nums[i]; // Update third to the current number
                }
                i++;
            }
    
            // If third remains at Long.MIN_VALUE, it means there are less than 3 distinct numbers, so return the largest number (first)
            if (third == Long.MIN_VALUE) {
                return (int) first;
            }
            
            // Return the third largest number
            return (int) third;
        }
    }
