import java.util.Stack;

public class SlidingWindowMax {
   
    // private int[] slidingWinMax(int[] arr,int k){
    //     return 
    // }
    private static int[] SlidingWindowMax(int[] nums,int k){
        int[] nge = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(nums.length-1);
        nge[nums.length-1]=nums.length;
        for(int i=nums.length-2;i>=0;i--){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nge[i]=nums.length;
            }else{
                nge[i]=stack.peek();
            }
            stack.push(i);
        }

        int[] result = new int[nge.length];
        int j=0;
        for (int i = 0; i < nge.length-k+1; i++) {
            if(j<i){
                j=i;
            }
            while(nge[j]<i+k){
                j=nge[j];
            }
            result[i]=nums[j];
            System.out.print(nums[j]+" ");
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] b = NextGreaterElement(new int[]{2,5,9,3,1,12,6,8,7});
        // int[] c = SlidingWindowMax(new int[]{2,5,9,3,1,12,6,8,7},b, 4);
        int[] c = SlidingWindowMax(new int[]{1,3,-1,-3,5,3,6,7}, 3);
    }
}
