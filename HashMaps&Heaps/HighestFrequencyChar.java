
import java.util.HashMap;

public class HighestFrequencyChar {
    public static void main(String[] args) {
        String s = "abracadabra";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hm.containsKey(i)){
                // hm.put(ch, i)(1);
                int of = hm.get(ch);
                int nf = of + 1;
                hm.put(ch,nf);
            }
            else{
                hm.put(ch,1);
            }
        }
        // int mfc = hm.get(s.charAt(0));
        char mfc =  s.charAt(0);
        
        for(Character key:hm.keySet()){
            if(hm.get(key)>hm.get(mfc)){
                mfc = key;
            }
        }
        System.out.println(mfc);
    }
}
