/*
NGIT - 09/10/2025
You are given a string S consisting of lowercase English letters and digits,
where the letters represent items and the digits represent packaging lines.

You have to count how many items are wrapped by packaging lines,
i.e., how many letters have a digit on the left and a digit on the right in the string.

Your task is to find and return an integer value representing the
number of items wrapped in packaging lines.

Sample Testcase:1
------------------------
input=1a2b3c4d5
output=4

Explanation:
------------------------------
In "1a2b3c4d5",
‘a’ is between 1 and 2 
‘b’ is between 2 and 3 
‘c’ is between 3 and 4 
‘d’ is between 4 and 5 
Hence total wrapped = 4
*/

class problem1{
    public static void main (String[] args) {
        String a = "1a2b3c4d5";
        int count =0 ;
        // 1 sey n-1 tak jana
        for(int i=1;i<a.length()-1;i=i+2){
            char ch = a.charAt(i);
            if((int)ch>=97 && (int)ch<=122){
                char li = a.charAt(i-1);
                char ri = a.charAt(i+1);
                if(((int)li>=48 && (int)li<=57) && ((int)ri>=48 && (int)ri<=57)){
                    count++;
                }
            }
        }
        System.out.println(count);
        //0 - 48
        //1 - 49
        //9 - 57 = 
        // char z ='9';
        // //97 and 122
        // System.out.print((int)z);

        
    }
}