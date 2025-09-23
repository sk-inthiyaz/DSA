
// package Recursion;
public class Day1{
    // public static boolean isPowerOfTwo(int n) {
    //     return n < 1 ? false : (n & (n - 1)) == 0 ? true : false;
    // }
    // public static void main(String[] args) {
    //     System.out.println(isPowerOfTwo(16));
    // }



    public static void printDecresing(int n){
        if(n>=0){
            System.out.println(n);
            printDecresing(n-1);
        }
    }


    // public static void printIncresing(int n){
    //     if(n==0){
    //         return;
    //     }
    //     printIncresing(n-1);
    //     System.out.println(n);
    // }
    
    public static void printDecresingIncresing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecresingIncresing(n-1);
        System.out.println(n);
    }

    // public static int fact(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     return (n*fact(n-1));
    // }

    // public static int pow(int x,int y){
    //     if(y==0){
    //         return 1;
    //     }
    //     return (x*pow(x,y-1));
    // }

    //Simple Trick for above one 
    public static int pow(int x,int y){
        if(y==0){
            return 1;
        }
        int z = pow(x,y/2);
        int xn = z * z;
        if(y%2!=0){
            xn = x * z * z;
        }
        return xn;
    }

    public static void main(String[] args) {
        // printDecresing(10);
        // printDecresingIncresing(5);
        // System.out.println(fact(5));
        System.out.println(pow(2,3));
    }
}