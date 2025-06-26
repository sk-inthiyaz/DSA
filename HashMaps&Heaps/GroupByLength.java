
/*Problem: Given a list of words, group them based on their lengths.
Testcase:
input=java is fun to code and happy to execute
output=Grouped by Length: {2=[is, to, to], 3=[fun, and], 4=[java, code], 5=[happy], 7=[execute]}

input=all is well and all the best
output=Grouped by Length: {2=[is], 3=[all, and, all, the], 4=[well, best]}

*/


/*Problem: Check if two strings are anagrams (i.e., contain the same characters with same frequency).
Testcases:
input=silent
listen
output=Are anagrams? true

input=Nike
Bike
output=Are anagrams? false
*/
import java.util.*;
class GroupByLength{
    public static void main (String[] args) {
        String str = "java is fun to code and happy to execute";
        String[] words= str.split(" ");
        HashMap<Integer,List> hm= new HashMap<>();
        for(String word:words){
            if(hm.containsKey(word)){
                
            }else{
                
            }
        }
    }
}