
import java.util.HashMap;

public class longest_substring_withk_uniq_chars {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k=3;
        HashMap<Character,Integer> hm = new HashMap<>();
        int l=0,r=0,sum=0,max=0;
        while(r<s.length()){
            char rth = s.charAt(r);
            hm.put(rth,hm.getOrDefault(rth, 0)+1);
            System.out.println(hm);
            sum+=1;
            if(hm.size()<k){
                r++;
            }
            while(hm.size()>k){
                char lth = s.charAt(l);
                hm.put(lth,hm.get(lth)-1);
                if(hm.get(lth)==0){
                    hm.remove(lth);
                }
                sum=sum-1;
                l++;
            }
            if(hm.size()==k){
                max = Math.max(max, sum);
                r++;
                System.out.println("max:"+max);
            }
        }
        System.out.println(max);
    }
}
