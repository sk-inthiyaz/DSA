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

        for (int i : rb) { 
            System.out.print(i+" ");
        }


        // Left boundary:Next Smaller index on left
        int[] lb = new int[arr.length];
        Stack <Integer> nstack = new Stack<>();
        nstack.push(0);
        lb[0]=-1;
        for(int i=1;i<arr.length;i++){
            while(nstack.size()>0 && arr[i]<=arr[nstack.peek()]){
                nstack.pop();
            }
            if(nstack.size()==0){
                lb[i]=-1;
            }else{
                lb[i] = nstack.peek();
            }
            nstack.push(i);
        }
        System.out.println();
         for (int i : lb) {
            System.out.print(i+" ");
        }
        int maxArea = 0;
        for(int i=0;i<arr.length;i++){
            int width = rb[i]-lb[i]-1;
            int area = arr[i] * width;
            if(area>maxArea){
                maxArea=area;
            }
        }
        System.out.println();
        System.out.println(maxArea); 
        return maxArea;
    }

public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max=0;
        stack.push(0);
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                max = getMax(heights,stack,max,i);
            }
            stack.push(i);
        }
        int i = heights.length;
        while(!stack.isEmpty()){
            max= getMax(heights,stack,max,i);
        }
        return max;
    }
    private int getMax(int[] arr,Stack<Integer> stack,int max,int i){
        int area;
        int popped = stack.pop(); 
        if(stack.isEmpty()){
             area = arr[popped] * i ;
        }
        else{
            area = arr[popped] * (i-1-stack.peek());
        }
        return Math.max(max,area);
    }
    public static void main(String[] args) {
        // int b = histogram(new int[]{6,6,5,4,5,1,6});
        int b = histogram(new int[]{2,1,5,6,2,3});
    }
}
