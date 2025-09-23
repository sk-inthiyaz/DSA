class SortedOrNot{
    public  static boolean sorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return ((arr[i]<arr[i+1]) && sorted(arr, i+1));
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,8,9,12};
        boolean s = sorted(arr,0);
        System.out.println(s);
    }
}