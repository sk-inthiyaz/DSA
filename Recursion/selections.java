public class selections {
    public static int  maxi(int[] arr,int s,int e){
        int max  = s;
        for(int i =s;i<=e;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex= maxi(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,8,1};
        selection(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
