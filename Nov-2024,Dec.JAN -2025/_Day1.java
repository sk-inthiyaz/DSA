//1.)Find Largest element
//2.)Find the second largest element and second smallest element
//3.)To check whether the array is sorted

import java.util.*;

//1.)Find Largest element
// import java.util.* ;
// import java.io.*; 
// public class _Day1 {

//     static int largestElement(int[] arr, int n) {
//         // Write your code here.
//         int largestElement=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>largestElement)
//             largestElement=arr[i];
//         }
//         return largestElement;
//     }
// }


//2.)Find the second largest element and second smallest element
// public class _Day1 {
//     public static int secondlargest(int a[],int n){
//         // Write your code here.
//         int largest = a[0];
//         int slargest = -1;
//         for(int i=1;i<n;i++){
//             if(a[i]>largest){
//                 slargest=largest;
//                 largest=a[i];
//             }
//             else if(a[i]<largest && a[i]>slargest)
//                 slargest=a[i];
//         }
//         return slargest;
//     }
//     public static int secondsmallest(int a[],int n){
//         int smallest=a[0];
//         int ssmallest=Integer.MAX_VALUE;
//         for(int i=1;i<n;i++){
//             if(a[i]<smallest){
//                 ssmallest = smallest;
//                 smallest = a[i];
//             }
//             else if(a[i]!=smallest && a[i]<ssmallest){
//                 ssmallest=a[i];
//             }
//         }
//         return ssmallest;
//     }
//     public static int[] getSecondOrderElements(int n, int []a) {
//         int[] newarray = {secondlargest(a,n),secondsmallest(a,n)};
//         return newarray;
//     }
// }

//3.)To check whether the array is sorted
/*
public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i=1;i<n;i++){
            if(a[i]>=a[i-1]){

            }
            else{
                return 0;
            }
        }
        return 1;
    }
}
 */

class _Day1{
    public static void main(String[] args) {
        // int[] x = {3,2,2,3};
        // int val=3;
        // int n=4;
        // int j=n-1;
        // for(int i=0;i<n;i++){
        //     if(x[i]==val){
        //         if(x[j]!=val){
        //             int temp=x[j];
        //             x[j]=x[i];
        //             x[i]=temp;
        //             j--;
        //         }
        //         else{
        //             int temp=x[j-2];
        //             x[j]=x[i];
        //             x[i]=temp;
        //             j=j-2;
        //         }
        //     }
        // }
        // for(int i:x){
        //     System.out.println(i);
        // }
        // System.out.println(j);
        // // System.out.println(x);
        // int x[] ={1,2,3,4,5};
        // int temp = x[0];
        // for(int i=1;i<x.length;i++){
        //     x[i-1]=x[i];
        // }
        // x[x.length-1]=temp;

        // for(int i:x){
        //     System.out.println(i);
        // }

        int x[] ={1,2,3,4,5,6,7};   
        Scanner sc =new Scanner(System.in);
        int d=sc.nextInt();
        d=d%(x.length);
        int[] temp = new int[d]; 
        for(int i=0;i<d;i++){
            temp[i]=x[i];
        }
        for(int i=d;i<x.length;i++){
            x[i-d]=x[i];
        }
        // int k=x.length-d;
        for(int i=0;i<temp.length;i++){
            x[x.length-d+i]=temp[i];
        }
        // x[x.length-1]=temp;

        for(int i:x){
            System.out.print(i+ " ");
        }

    }
}