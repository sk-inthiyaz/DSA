/*
You are given a 0-indexed array words consisting of distinct strings.
The string words[i] can be paired with the string words[j] if:
The string words[i] is equal to the reversed string of words[j].
0 <= i < j < words.length.
Return the maximum number of pairs that can be formed from the array words.
Note that each string can belong in at most one pair.

Sample Testcase:1
-------------------------------------
input=cd ac dc ca zz
output=2
Explanation:
------------------------------
we can form 2 pair of strings in the following way:
- We pair the 0th string with the 2nd string, as the reversed string of word[0] is "dc" 
and is equal to words[2].
- We pair the 1st string with the 3rd string, as the reversed string of word[1] is "ca" 
and is equal to words[3].
It can be proven that 2 is the maximum number of pairs that can be formed.
*/


class Ba{

    public static int countreversestrings(String arr[],int j){
        if(arr.length == c){
            return 0;
        }
        
    }

    public static void main (String[] args) {
        // HashMap<String,Integer> hm = new HashMap<>();
        // for(int i=0;i<)
        
        String s = "cd ac dc ca zz";
        String arr[] = s.split(" ");
        int c = 0;
        for(int i=0;i<arr.length;i++){
            String z = arr[i];
            for(int j=i+1;j<arr.length;j++){
                String a = arr[j];
                StringBuilder sb = new StringBuilder(a);
                if(z.equals(sb.reverse().toString())){
                    c++;
                }
            }
        }
        System.out.println(c);
    
    
    }
    
    }
    
    
    