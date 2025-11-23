import java.util.*;
public class longest_substring_without_uniq_chars {
    public static void main(String[] args) {
        String s = "pwwkew";
        int l=0,r=0,sum=0,max=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        while(r<s.length()){
            char rth = s.charAt(r);
            hm.put(rth,hm.getOrDefault(rth, 0)+1);
            System.out.println(hm);
            while(hm.get(rth)>1){
                char lth = s.charAt(l);
                hm.put(lth,hm.get(lth)-1);
                if(hm.get(lth)==0){
                    hm.remove(lth);
                }
                l++;
            }
            max = Math.max(max, r-l+1);
            r++;
        }
        System.out.println(max);
        
    }
}