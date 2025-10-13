public class _Day3 {
    //Union of an array
	// public static void main(String[] args) {
	// 	int[] nums1 = {1,2,3};
	// 	int[] nums2 = {2,5,6};
	// 	int m = nums1.length;
	// 	int n = nums2.length;
	// 	int p1=m-1,p2=n-1,i=m+n-1;
    //     while(p2>=0){
    //         if(p1>=0 && nums1[p1]>nums2[p2]){
    //             nums1[i--]=nums1[p1--];
    //         }
    //         else{
    //             nums1[i--]=nums2[p2--];
    //         }
    //     }
	// 	for(int j:nums1){	
	// 		System.out.println(j + " ");
	// 	}
	// }


    //Remove element
    /*
    Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2,_,_]
    Explanation: Your function should return k = 2, with the first two elements of nums being 2.
    It does not matter what you leave beyond the returned k (hence they are underscores).

     */
    // public static void main(String[] args) {
    //     // int[] nums= {0,1,2,2,3,0,4,2};
    //     int[] nums= {1,2,2,3};
    //     int val=2;
    //     int j=0;
    //     for(int i=0;i<nums.length;i++){
    //             if(nums[i]!=val){
    //                 nums[j]=nums[i];
    //                 j++;
    //             } 
    //     }
    //     System.out.println(j);
    //     for(int k:nums){
    //         System.out.print(k + " ");
    //     }
    // }

    //Plus one
    public static void main(String[] args) {

        /*
         public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
        
    }
         */
        int[] a = {4,3,2,1};
        System.out.print("Input:");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        int n = a.length-1;
        double s = 0;
        for(int i=0;i<a.length;i++){
            s = s + (a[i]*Math.pow(10, n));
            n--;
        }
        s= s + 1;
        int k = (int)s;
        System.out.println(k);
        int c=0;
        while(k!=0){
            c=c+1;
            k=k/10;
        }
        System.out.println(c);
        int[] arr = new int[c];
        double r;
        int narr = c;
        c=c-1;
        double l = (double)s;
        for(int i=0;i<narr;i++){
            r = l/Math.pow(10, c);
            arr[i]=(int)r;
            l=l%Math.pow(10, c);
            c--;
        }
        System.out.println("output:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
