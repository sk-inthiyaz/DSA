package String;
import java.io.*;
import java.math.*;
/*
58. Length of Last Word
Easy
Topics
Companies
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.


50. Pow(x, n)
Medium
Topics
Companies
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
Constraints:
-100.0 < x < 100.0
-231 <= n <= 231-1
n is an integer.
Either x is not zero or n > 0.
-104 <= xn <= 104
 */
public class lenlast {
    // public static int lengthOfLastWord(String s) {
    //     String[] parts = s.split(" ");
    //     return parts[parts.length-1].length();
    // }

    // public static double formatDouble(double value){
    //     BigDecimal bd = new BigDecimal(value).setScale(5, RoundingMode.HALF_UP);
    //     return bd.doubleValue();
    // }
    public static double myPow(double x, int n) {
        BigDecimal result = new BigDecimal(Math.pow(x,n));
        return result.setScale(5,RoundingMode.HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        // int s = lengthOfLastWord("luffy is still joyboy");
        // System.out.println(s);

        System.out.println(myPow(2.00000,10));
        System.out.println(myPow(2.00000,-2));
    }

}
