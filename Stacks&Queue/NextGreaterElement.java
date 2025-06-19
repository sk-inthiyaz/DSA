import java.util.*;

class NextGreaterElement{
    //input:2,5,9,3,1,12,6,8,7
    //output:5 9 12 12 12 -1 8 -1 -1 
    public static void main(String[] args) {
        // int[] arr = {2,5,9,3,1,12,6,8,7};
        // Stack<Integer> stack = new Stack<>();
        // int[] result = new int[arr.length];
        // result[arr.length-1]=-1;
        // stack.push(arr[result.length-1]);
        // for(int i=arr.length-2;i>=0;i--){
        //     while (stack.size()>0 && arr[i]>=stack.peek()) { 
        //         stack.pop(); 
        //     }
        //     if(stack.size()==0){
        //         result[i]=-1;
        //     }else{
        //          result[i]=stack.peek();
        //     }
        //     stack.push(arr[i]);
        // }
        // for (int i : result) {
        //     System.out.print(i+" ");
        // }


        //Alternative solution
        int[] arr = {2,5,9,3,1,12,6,8,7};
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        stack.push(0);
        for(int i=0;i<arr.length;i++){
            while(stack.size()>0 && arr[i]>arr[stack.peek()]){
                int pos = stack.peek();
                result[pos]=arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        while(stack.size()>0){
            int pos = stack.peek();
            result[pos]=-1;
            stack.pop();
        }
         for (int i : result) {
            System.out.print(i+" ");
        }
    }
}