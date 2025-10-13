import java.util.Arrays;

/**
You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.

You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.

Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.

 

Example 1:

Input: spells = [5,1,3], potions = [1,2,3,4,5], success = 7
Output: [4,0,3]
Explanation:
- 0th spell: 5 * [1,2,3,4,5] = [5,10,15,20,25]. 4 pairs are successful.
- 1st spell: 1 * [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.
- 2nd spell: 3 * [1,2,3,4,5] = [3,6,9,12,15]. 3 pairs are successful.
Thus, [4,0,3] is returned.
 */
public class successfulPairs {
    public static void main(String[] args) {
        // int[] spells = new int[]{5,1,3};
        int[] spells = new int[]{3,1,2};
        // int[] potions  = new int[]{1,2,3,4,5};
        int[] potions  = new int[]{8,5,8};
        int success = 16;
        int[] narr = new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int l = 0;
            int r = potions.length ;
            int c = 0;
            while(l<r){
                int mid = (l+r)/2;
                if((spells[i]*potions[mid])>=success){
                    c = potions.length - mid;
                    r--;
                }
                else{
                    l++;
                }
            }
            narr[i] = c;
        }
        System.out.println(Arrays.toString(narr));
    }
}
