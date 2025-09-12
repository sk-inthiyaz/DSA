import java.util.HashMap;
import java.util.Map;

class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        // 1. Basic check: if lengths are different, they can't be isomorphic.
        if (s.length() != t.length()) {
            return false;
        }
        
        // 2. Create a HashMap to store mappings: <char from s, char from t>.
        Map<Character, Character> s_to_t_map = new HashMap<>();
        
        // 3. Loop through both strings from the beginning to the end.
       for(int i=0;i<s.length();i++){
        char s_char = s.charAt(i);
        char t_char = t.charAt(i);
        if(s_to_t_map.containsKey(s_char)){
            if(s_to_t_map.get(s_char)!=t_char){
                return false;
            }
        }
        else{
            if(s_to_t_map.containsValue(t_char)){
                return false;
            }
            s_to_t_map.put(s_char,t_char);
        }
       }
        
        // 5. If the loop completes without finding any conflicts, the strings are isomorphic.
        return true; 
    }
    public static void main(String[] args) {
        boolean g = isIsomorphic("paper","title");
    }
}