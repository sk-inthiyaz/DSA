import  java.util.*;
//input:100,80,60,70,60,75,85
//output:1 1 1 2 1 4 6 
public class stockSpan {
    public static  int[] stockspan(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        result[0]=1;
        for(int i=1;i<arr.length;i++){
            while(stack.size()>0 && arr[stack.peek()]<arr[i]){
                stack.pop();
            }
            if(stack.size()==0) result[i]=i+1;
            else result[i]=i-stack.peek();
            stack.push(i);
        }
        for (int i : result) {
            System.out.print(i+" ");
        }
        return result;
    }
    public static void main(String[] args) {
        int[] b  = stockspan(new int[]{100,80,60,70,60,75,85});
    }
}
