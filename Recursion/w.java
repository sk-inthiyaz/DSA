/*
input=11221111555671
1
Output=3
1)
You are given a numeric string s consisting of digits '0' to '9' and an integer k. 
You can choose any digit in the string and change it to any other digit. 
You can perform this operation at most k times.

Your task is to find and return the length of the longest substring that contains 
the same digit after performing at most k changes.

Input Format:
------------------------------------
Line:1 String followed by k value ie is number of changes that can be made


Sample Testcase:1
-------------------------------------
input=11221
1
Output=3
Explanation:
-----------------------------------
Replace one '2' with '1' → "11121". Longest substring with same digit = "111", length = 3.

*/
class w{
    public static void main (String[] args) {
        String n = "11221111555671";
        int len = n.length();
        int l = 0;
        int r = 0;
        int max = Integer.MIN_VALUE;
        int target = 1;
        int count = 0;

        for(int i = 0;i<len;i++){
            r = i;
            count = 0;
            while(r<len){
                int chnum = n.charAt(r) - '0';
                // System.out.print(chnum+" ");
                if(chnum == target){
                    r++;
                    count++;
                    if(count>max){
                        max = count;
                    }
                }
                else{
                    if(count>0){
                        count=count+1;
                    }
                    if(count>max){
                        max = count;
                    }
                    break;
                }
            }
            // System.out.println("");
        }

        System.out.println(max);
    // while(l<len && r<len){
    //     int chnum = n.charAt(l) - '0';
    //     if(chnum == target){
    //         r++;
    //         count = r - l;
    //         if(count>max){
    //             max = count;
    //         }
    //     }
    //     else{
    //         l++;
    //         r--;
    //         count = 0;
    //     }

        
    // }
    }
}