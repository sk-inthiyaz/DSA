import java.util.Stack;

public class Histogram {
    //input:6,2,5,4,5,1,6
    //output:12
    public static int histogram(int[] arr){
        
        //Right boundary:Next smaller index on right
        int[] rb = new int[arr.length];
        Stack <Integer> stack = new Stack<>();
        stack.push(arr.length-1);
        rb[arr.length-1]=arr.length;
        for(int i=arr.length-2;i>=0;i--){
            while(stack.size()>0 && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.size()==0){
                rb[i]=arr.length;
            }else{
                rb[i] = stack.peek();
            }
            stack.push(i);
        }



        // Left boundary:Next Smaller index on left
        int[] lb = new int[arr.length];
        stack = new Stack<>();
        stack.push(0);
        lb[0]=-1;
        for(int i=1;i<arr.length;i++){
            while(stack.size()>0 && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.size()==0){
                lb[i]=-1;
            }else{
                lb[i] = stack.peek();
            }
            stack.push(i);
        }

        int maxArea = 0;
        for(int i=0;i<arr.length;i++){
            int width = rb[i]-lb[i]-1;
            int area = arr[i] * width;
            if(area>maxArea){
                maxArea=area;
            }
        }
        System.out.println(maxArea);
        return maxArea;
    }

    public static void main(String[] args) {
        int b = histogram(new int[]{6,6,5,4,5,1,6});
    }
}
