// Day 2,3['Towerhonei','DisplayArray','Displayreversearray','MaxElementArray'],
// 4['FirstIndexOccurence','LastIndexOccurence'];5['allIndeces','Subsequence','countOccurrences']
//5['Key_Pad_Combination']
// package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.xml.validation.Schema;

// import String.lenlast;

public class Day2 {
    // public static void pzz(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println("Pre:"+n);
    //     pzz(n-1);
    //     System.out.println("In:"+n);
    //     pzz(n-1);
    //     System.out.println("Post:"+n);
    // }
    // public static void main(String[] args) {
    //     pzz(5);
    // }

    //1Q)Tower of honie
    // public static void toh(int n,int t1id,int t2id,int t3id){
    //     if(n==0){
    //         return;
    //     }
    //     toh(n-1,t1id,t3id,t2id);
    //     System.out.println(n+"["+t1id+"->"+t2id+"]");
    //     toh(n-1,t3id,t2id,t1id);
    // }
    // public static void main(String[] args) {
    //     int n=3;
    //     toh(n,1,2,3);
    // }

    // 2Q)Print the array using the recursion
    // public static void DisplayArr(int[] arr,int idx){
    //     if(idx==0){
    //         return;
    //     }
    //     DisplayArr(arr, idx-1);
    //     System.out.println(arr[idx-1]);
    // }
    // public static void main(String[] args) {
    //     int x[] = {1,2,3,4,5};
    //     DisplayArr(x, 5);
    // }

    // public static void DisplayReverseArr(int[] arr,int idx){
    //     if(idx==0){
    //         return;
    //     }
    //     System.out.println(arr[idx-1]);
    //     DisplayReverseArr(arr, idx-1);
    // }
    // public static void main(String[] args) {
    //     int x[] = {1,2,3,4,5};
    //     DisplayReverseArr(x, 5);
    // }

    //Q)Max of number
    // static int max = -1;
    // public static int maxArray(int[] arr,int idx){
    //     if(arr.length-1==idx){
    //         return 0;
    //     }
    //     if(max<arr[idx]){
    //         max=arr[idx];
    //     }
    //     maxArray(arr, idx+1);
    //     return max;
    // }
    // public static void main(String[] args) {
    //     int x[] = {1,5,4,3,2};
    //     System.out.println(maxArray(x, 0));
        
    // }

    // public static int FirstIndexOccurence(int arr[],int idx,int element){
    //     if(arr.length-1==idx){
    //         return -1;
    //     }
    //     if(arr[idx]==element){
    //         return idx;
    //     }
    //     else{
    //         return FirstIndexOccurence(arr, idx+1, element);
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[] = {2,3,9,8,7,6,4,12,7,3,8};
    //     System.out.println(FirstIndexOccurence(arr, 0, 8));
    // }

    // public static int LastIndexOccurence(int arr[],int idx,int element){
    //     // if(idx==-1){
    //     //     return -1;
    //     // }
    //     if(idx==arr.length){
    //         return -1;
    //     }
    //     int liisa = LastIndexOccurence(arr, idx+1, element);
    //     if(liisa==-1){
    //         if(arr[idx]==element){
    //             return idx;
    //         }
    //         else{
    //             return -1;
    //         }
    //     }
    //     else{
    //         return liisa;
    //     }
    // }

    // public static void main(String[] args) {
    //     int arr[] = {1,3,1,4,5};
    //     System.out.println(LastIndexOccurence(arr, 0, 1));
    // }

    // public static int[] allIndeces(int arr[],int x,int idx,int fsf){
    //     if(arr.length==idx){
    //         return new int[fsf];
    //     }
    //     if(arr[idx]==x){
    //         int[] iarr = allIndeces(arr, x, idx+1, fsf+1);
    //         iarr[fsf]=idx;
    //         return iarr;
    //     }
    //     else{
    //         int[] iarr = allIndeces(arr, x, idx+1, fsf);
    //         return iarr;
    //     }
    // }
    // public static void main(String[] args) {
    //     int[] arr = {2,3,6,9,8,3,2,3,6,4};
    //     int[] narr = allIndeces(arr, 3, 0, 0);
    //     for (int i : narr) {
    //         System.out.print(i+" ");
    //     }
    // }

    //Quetion:countOccurrences
    // public static int countOccurrences(int arr[], int x,int idx, int count) {
    //     // Base case: If index reaches the end of the array, return 0
    //     if(arr.length==idx){
    //         return count;
    //     }
    //     if(arr[idx]==x){
    //         return countOccurrences(arr, x, idx+1,count+1);
    //     }
    //     else{
    //         return countOccurrences(arr, x, idx+1, count);
    //     }
    // }

    // public static void main(String[] args) {
    //     int arr[] = {1, 2, 3, 2, 4, 2, 5};
    //     int x = 2;
    //     System.out.println(countOccurrences(arr, x,0, 0));  // Expected output: 3
    // }


    //Subsequence
    // Input:abc
    //output:[, c, b, bc, a, ac, ab, abc]
    // public static ArrayList<String> gss(String str){
    //     System.out.println("String:"+str);
    //     if(str.length()==0){
    //         System.out.println("(Since size is 0 Base Case Array created: "+str.length());
    //         ArrayList<String>bres = new ArrayList<>();
    //         bres.add("");
    //         System.out.println("BaseCase Array:"+bres);
    //         return bres;
    //     }
    //     System.out.println("Size of the String:"+str.length());
    //     char ch = str.charAt(0);
    //     String ros = str.substring(1);
    //     System.out.println("First Index:"+ch+" Other Index:"+ros);
    //     System.out.println("Created a new ArrayList(rres) [] and doing recursive....");
    //     ArrayList<String> rres = gss(ros);
    //     ArrayList<String> mres = new ArrayList<>();
    //     System.out.println("mres ArrayList created[]");
    //     for(String rstr:rres){
    //         mres.add(""+rstr);
    //         System.out.println("Adding to mres():"+rstr);
    //     }
    //     for(String rstr:rres){
    //         mres.add(ch+rstr);
    //         System.out.println("Adding to mres("+ch+"):"+ch+rstr);
    //     }
    //     System.out.println(mres);
    //     System.out.println("Returning mres...");
    //     return mres;
    // }

    // public static void main(String[] args) {
    //     ArrayList<String> result=gss("abc");
    //     System.out.println(result);
    // }

    //Day5:
    //Quetion:Key_Pad_Combination (KPC)
    /*
    "You are given a string str. The string str will contain numbers only, where each number stands for a key pressed on a mobile phone.

    The following list is the key to characters map: 
    0 -> .; 
    1 -> abc 
    2 -> def 
    3 -> ghi 
    4 -> jkl 
    5 -> mno 
    6 -> pqrs 
    7 -> tu  
    8 -> vwx 
    9 -> yz

    Complete the body of the getKPC function - without changing the signature - to get the list of all words that could be produced by the keys in str. Use sample input and output to get an idea about the output."
     */
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str){//573 73 3
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);//5 7 3
        String ros = str.substring(1);//73 3 ""
        ArrayList<String> rres = getKPC(ros);
        int a = ch - '0';
        String codeforch = codes[a];
        ArrayList<String> mres = new ArrayList<>();
        for(int i=0;i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            for(String rstr:rres){
                mres.add(chcode+ rstr);
            }
            
           
        }
        return mres;//73 3 ""
    }
    public static void main(String[] args) {
        String str = "573";
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }



}
