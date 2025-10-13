import java.util.Arrays;

public class SelctionSort {
     public static void selection(int[] arr,int r,int c,int max){//max = max ele index
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[max]){
                max = c;
                c++;
            }
            else{
                c++; 
                max = max;
            }
        }
        else{
                int temp = arr[max];
                arr[max] = arr[r-1];
                arr[r-1]= temp;
                r--;
                c=0;
                max=0;
         }
        selection(arr, r, c,max);
        
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        selection(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
        
    }
}
