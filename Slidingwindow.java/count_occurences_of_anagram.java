
import java.util.*;

public class count_occurences_of_anagram {
    public static void main(String[] args) {
        String s = "forxxprfxxofr";
        String ptr = "for";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:ptr.toCharArray()){
            hm.put(c,hm.getOrDefault(c, 0)+1);
        }
        
        int r=0,l=0,k=ptr.length(),count=hm.size(),ans=0;
        while(r<s.length()){
            char ch = s.charAt(r);
            
            // Decrease map value if character exists
            if(hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);
                if(hm.get(ch) == 0) count--;
            }
            
            // Window size reached
            if(r-l+1 == k){
                // Calculate answer
                if(count == 0) ans++;
                
                // Slide the window - restore left character
                char leftChar = s.charAt(l);
                if(hm.containsKey(leftChar)) {
                    if(hm.get(leftChar) == 0) count++;
                    hm.put(leftChar, hm.get(leftChar) + 1);
                }
                l++;
            }
            r++;
        }
        System.out.println(ans);
    }
}
