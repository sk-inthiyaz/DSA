
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
            if(hm.containsKey(ch)) ;//decrese map value
            if(hm.get(ch)==0) count--;
            if(r-l+1<k) r++;
            if(r-l+1==k){
                //1.calculate answer 
                //2.slide thew window
                if(count==0) ans++;
            }
        }
        System.out.println(ans);
    }
    //
}
