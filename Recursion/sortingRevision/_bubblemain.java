import java.util.Arrays;
public class _bubblemain {
    public static  void bubblesort(int[] arr,int i,int end){
    if(i==arr.length){
        return;
    }
    if(arr[i-1]>arr[i]){
        int temp = arr[i-1];
        arr[i-1] = arr[i];
        arr[i] = temp;
    }
    bubblesort(arr, i=i+1, end);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{8,7,1,8,5};
        bubblesort(arr,1,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

