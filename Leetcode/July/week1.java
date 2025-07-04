// [01-07-2025] 3330. Find the Original Typed String I 
// [02-07-2025] 6. Zigzag Conversion
// [03-07-2025] 3304. Find the K-th Character in String Game I
// [04-07-2025] 509. Fibonacci Number
class week1{
    public int possibleStringCount(String word) {
        int len = word.length(),count = 1;
        for(int i=1;i<len;i++){
            if(word.charAt(i)==word.charAt(i-1)){
                count+=1;
            }
        }
        return count;
    }
    /*
    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
     */
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<numRows;i++){
            int idx = i;
            int deltaSouth = 2 * (numRows-i-1);
            int deltaNorth = 2 * i;
            boolean goingSouth = true;
            while(idx<s.length()){
                sb.append(s.charAt(idx));
                if(i==0){
                    idx+=deltaSouth;
                }else if(i==numRows-1){
                    idx+=deltaNorth;
                }else{
                    if(goingSouth){
                        idx+=deltaSouth;
                    }else{
                        idx+=deltaNorth;
                    }
                    goingSouth = !goingSouth;
                }
            }
        }
        return sb.toString();
    }




/*
509. Fibonacci Number
Solved
Easy
Topics
premium lock icon
Companies
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

 

Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 

Constraints:

0 <= n <= 30
 */

    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

/*
50. Pow(x, n)
Solved
Medium
Topics
premium lock icon
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

    public  static  double myPow(double x, int n) {
        if(n<0){
            n=-n;
            System.out.println(n);
            x=1/x;
            System.out.println(x);
        }
        double pow = 1;
        while(n!=0){
            if((n&1)!=0){
                pow *= x;
            }
            x *= x;
            n>>>=1;
        }
        return pow;
    }

    public static void main(String[] args) {
        double x = myPow(2.00000, 10);
    }
}