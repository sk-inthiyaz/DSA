public class _Largest3sum {
    public static void main(String[] args) {
        int arr[] = new int[]{2,3,5,2,9,7,1},k=3;//
        int  sum=0,lsum,j;
        // for(int i=0;i<k;i++){
        //     sum+=arr[i];
        // }
        // int l=1,r=k;
        // j=l;
        // lsum=sum;
        // if(arr.length>k){
        //     while(r<arr.length){
        //         j = l-1;
        //         sum = sum - arr[j] + arr[r];
        //         if(lsum<sum){
        //             lsum = sum;
        //         }
        //         l++;
        //         r++;
        //     }
        // }
        //
        

        int l=0,r=0;
        lsum=0;
        while(r<arr.length){
            sum=sum+arr[r];
            if(r-l+1<k){
                r++;
            }
            else if(r-l+1==k){
                lsum = Math.max(lsum, sum);
                sum = sum - arr[l];
                l++;
                r++;
            }
        }
        System.out.println("Longest 3sum:"+lsum);
    }
}
