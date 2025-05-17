import java.util.*;

import java.util.Scanner;

public class _Day5 {
    //Binary search
    // public static int search(int []nums, int target) {
    //     // Write your code here.
    //     int l=0;
    //     int h=nums.length-1;
    //     int mid;
    //     while(l<=h){
    //         mid=(l+h)/2;
    //         if(target==nums[mid]){
    //             return mid;
    //         }
    //         else if(target>nums[mid])
    //             l = mid+1;
    //         else if(target<nums[mid])
    //             h = mid-1;
    //     }
    //    return -1;

    // }

    //DAY-6


    // public static void main(String[] args) {
        // System.out.println(search(new int[]{1,3,7,9,11,12,45}, 3));

    //DAY-6
		// Write code here
	// 	Scanner sc = new Scanner(System.in);
	// 	int n =	sc.nextInt();
	// 	int[] x = new int[n];
	// 	for(int i=0;i<n;i++)
	// 		x[i] = sc.nextInt();
	// 	int e = sc.nextInt();
    //     int s=0;
	// 	for(int i=n-1;i>=0;i--){
	// 		if(x[i]==e){
	// 			s=i;
	// 			break;
	// 		}
	// 	}
    //     if(s!=0){
    //         System.out.println(s);
    //     }
    //     else{
    //         System.out.println(-1);
    //     }
	// 	sc.close();
	// }


    //Day-7:
    // public static void sort012(int[] arr)
    // {
    //     //Write your code here
    //     int low = 0, mid = 0, high = arr.length - 1;

    //     while (mid <= high) {
    //         if (arr[mid] == 0) {
    //             // Swap arr[low] and arr[mid], increment low and mid
    //             int temp = arr[low];
    //             arr[low] = arr[mid];
    //             arr[mid] = temp;
    //             low++;
    //             mid++;
    //         } else if (arr[mid] == 1) {
    //             // Move mid pointer as 1 is already in place
    //             mid++;
    //         } else if (arr[mid] == 2) {
    //             // Swap arr[mid] and arr[high], decrement high
    //             int temp = arr[mid];
    //             arr[mid] = arr[high];
    //             arr[high] = temp;
    //             high--;
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     sort012(new int[]{0,1,2,2,1,0});
    // }


    //Day8:
    //swap alternate
    // public static void swapAlternate(int arr[]) {
    // 	//Your code goes here
    //     int n = arr.length;
    //     int nn= n;
    //     int temp;
    //     if(n%2==0){
    //         for(int i=1;i<n;i+=2){
    //             temp = arr[i-1];
    //             arr[i-1]=arr[i];
    //             arr[i]=temp;
    //             // System.out.println(i);
    //         }
    //     }
    //     else{
    //         n=arr.length-1;
    //         for(int i=1;i<n;i+=2){
    //             temp = arr[i-1];
    //             arr[i-1]=arr[i];
    //             arr[i]=temp;
    //         }
    //     }
    //    for(int i=0;i<nn;i++){
    //     System.out.print(arr[i]+" ");
    //    }
    // }
    // public static void main(String[] args) {
    //     swapAlternate(new int[]{9,3,6,12,4,32,5});
    // }
    

    //Day9:
    // public static void main(String[] args) {
	// 	// Write your code here
    //     // Input: 'n' = 132456
    //     // Output: 12 9
	// 	// int n = 132456;
    //     // int even = 0;
    //     // int odd = 0;
    //     // int r;
    //     // while(n>0){
    //     //     r = n%10;
    //     //     if(r%2==0){
    //     //         even = even+r;
    //     //     }
    //     //     else{
    //     //         odd = odd+r;
    //     //     }
    //     //     n=n/10;
    //     // }
	// 	// System.out.println(even+" "+odd);
	// }


    //Day10:
    public static int sumOfMaxMin(int[] arr, int n) {
        // Write your code here.
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return max+min;
    }
    public static void main(String[] args) {
        System.out.println(sumOfMaxMin(new int[]{-1,-4,5,8,9,3}, 6));
    }
}
