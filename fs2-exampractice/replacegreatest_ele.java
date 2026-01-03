
import java.util.*;

class replacegreatest_ele {
    public static  int[] replaceElements(int[] arr) {
        int maxright = -1;
        for(int i=arr.length-1;i>=0;i--){
            int current = arr[i];
            arr[i] = maxright;
            maxright = Math.max(current, maxright);
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }
    public static void main(String[] args) {
        int[] b = replaceElements(new int[]{17,18,5,4,6,1});
    }
}