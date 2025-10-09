// import SortingWithRec.*;
import java.util.Arrays;

public class BubbleSort {
    public static void bubble(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
                c++;
            }
        }
        else{
                r--;
                c=0;
         }
        bubble(arr, r, c);
        
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
        
    }
}
