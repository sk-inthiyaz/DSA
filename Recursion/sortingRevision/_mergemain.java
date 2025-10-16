// package sortingRevision;

import java.util.Arrays;

public class _mergemain {

    public static int[] merge(int[] start,int[] end){
        int[] mix = new int[start.length+end.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<start.length && j<end.length){
            if(start[i]<end[j]){
                mix[k] = start[i];
                k++;
                i++;
            }
            else{
                mix[k] = end[j];
                k++;
                j++;
            }
        }
        while(i<start.length){
            mix[k] = start[i];
            i++;
            k++;
        }
        while(j<end.length){
            mix[k] = end[j];
            j++;
            k++;
        }
        return mix;
    }
    public static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = (arr.length)/2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    } 

    public static void main(String[] args) {
        int[] arr = new int[]{8,7,1,8,5};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
