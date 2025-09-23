public class Binary_search {
    public static int binarys(int[] arr,int target,int s,int e){
        if(s>e){
            return 0;
        }
        int m = s+ (e-s)/2;
        System.out.println(m);
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            System.out.println(m);
            return binarys(arr, target, s, m-1);
        }
        if(target>arr[m]){
            return binarys(arr, target, m+1, e);
        }
        return binarys(arr, target, m+1, e);
    }
    public static void main(String[] args) {
        int arr[] = {10,12,15,20,50};
        int b = binarys(arr, 50, 0, arr.length-1);
        System.out.println(b);
    }
}
