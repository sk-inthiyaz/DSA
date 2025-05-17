class _Day4{
    /*13.)Missing Number: 
     * Problem statement
    Given an array ‘a’ of size ‘n’-1 with elements of range 1 to ‘n’. The array does not contain any duplicates. Your task is to find the missing number.
    For example:
    Input:
    'a' = [1, 2, 4, 5], 'n' = 5
    Output :
    3
    */
    public  static int missingNumber(int []a, int N) {
        // Write your code here.
        /*int x=0,y=0;
        for(int i=1;i<N-1;i++){
            if(a[i]-a[i-1]!=1){
                x = a[i]-1;
                // break;3
            }
            else{
                y = a[i]+1;
                // break;
            }
        }
        if(x!=0){
            return x;
        }
        else{
            return y;
        }*/
        int sum = (N * (N+1))/2;
        int s = 0;
        for(int i=0;i<N-1;i++){
            s+=a[i];
        }
        return (sum-s);
    }

    //14.Maximum Consecutive ones
    public static int consecutiveOnes(int n, int[] arr) {
		// Write your code here.
        int c=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                c++;
                if(c>max)
                    max=c;
            }
            else{
                c=0;
            }
        }
		return max;
	}
    //15.Find the single element
    public static int getSingleElement(int []arr){
        // Write your code here.
        int XOR = 0;
        for(int i=0;i<arr.length;i++){
            XOR = XOR ^ arr[i];
        }
        return XOR;
    }

    //16.Longest sub array with sum element k
    // public static int longestSubarrayWithSumK(int []a, long k) {
    //     // Write your code here
    //     int s=0;
    //     int c=0;
    //     int max=0;
    //     for(int i=0;i<a.length;i++){
    //         if(a[i]<k){
    //             s=s+a[i];
    //             if(s==k){
    //                 if(max<c){
    //                     max=c;
    //                     s=0;
    //                     c=0;
    //                 }
    //             }
    //         }
    //     else if(a[i]==k){
    //         c=1;
    //         if(max<c){
    //             max=c;
    //             s=0;
    //             c=0;
    //         }
    //     }
    //     }
    //     return max;
    // }
    public static int longestSubarrayWithSumK(int[] a, long k) {
        int maxLen = 0;
        int start = 0;
        long sum = 0;
    
        for (int end = 0; end < a.length; end++) {
            sum += a[end]; // Add the current element to the sum
    
            // Shrink the window from the left if the sum exceeds `k`
            while (sum > k && start <= end) {
                sum -= a[start];
                start++;
            }
    
            // Check if the current window has a sum equal to `k`
            if (sum == k) {
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }
    
        return maxLen;
    }
    
    public static void main(String[] args){
        // 13.)Missing Number: 
        // System.out.println(missingNumber(new int[]{1,2,3,5,6,7,8},8));
        // System.out.println(missingNumber(new int[]{1,2,3},4));
        // System.out.println(missingNumber(new int[]{1,2,4,5},5));

        //14.Maximum Consecutive ones
        // System.out.println(consecutiveOnes(8, new int[]{ 0, 1, 1, 0, 0, 1, 1, 1}));

         //15.Find the single element
        //  System.out.println(getSingleElement(new int[] {1,1,2,3,3,4,4}));
         
         //16.Longest sub array
         System.out.println(longestSubarrayWithSumK(new int[]{1,2,3,1,1,1,1,4,2,3},3));

    }
}