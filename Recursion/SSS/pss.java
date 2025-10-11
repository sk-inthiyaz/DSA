// Print subsequence in java
//Store in ArrayList

import java.util.ArrayList;

public class pss {
        // private static void printSubSequence(String p,String up){
        //     if(up.isEmpty()){
        //         System.out.println(p);
        //         return;
        //     }
        //     char ch = up.charAt(0);
        //     printSubSequence(p+ch, up.substring(1));
        //     printSubSequence(p, up.substring(1));
        // }

        // public static void main(String[] args) {
        //     printSubSequence("","abc");
        // }


    private static ArrayList<String> printSubSequenceA(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = printSubSequenceA(p+ch, up.substring(1));;
        ArrayList<String> right = printSubSequenceA(p, up.substring(1));
        left.addAll(right);
        return left;
        
    }
    public static void main(String[] args) {
        ArrayList<String> b = printSubSequenceA("","abc");
        System.out.println(b);
    }

}
