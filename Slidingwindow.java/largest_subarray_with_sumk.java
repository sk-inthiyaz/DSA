public class largest_subarray_with_sumk {
    public static void main(String[] args) {
        // int arr[] = new int[]{4,1,1,1,2,3,5};
        int arr[] = new int[]{3,2,4,5,1,1,1,1,1,3,3};
        int sum=0,l=0,r=0,max=0,k=5;
        while(r<arr.length){
            sum+=arr[r];
            while(sum>k){
                    sum = sum-arr[l];
                    l++;
                   
                }
            
            if(sum==k){
                max = Math.max(max, r-l+1);
            }
             r++;
        }
        System.out.println("MaxLength:"+max);
    }
}
