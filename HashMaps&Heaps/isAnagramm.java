import java.util.*;
class isAnagramm {
    public static  boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Integer> s1 = new HashMap<>();
        HashMap<Character,Integer> t1 = new HashMap<>();
        for(char c:s.toCharArray()){
            s1.put(c,s1.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            t1.put(c,t1.getOrDefault(c,0)+1);
        }
        System.out.println(s1);
        System.out.println(t1);
        System.out.println(s1.equals(t1));
        return true;
    }
    public static void main(String[] args) {
        boolean g =  isAnagram("anagram","nagaram");
    }
}