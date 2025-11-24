/*
✅ Q3: Remove Consecutive Duplicate Characters (Recursion or simple loop)

Given a string, remove consecutive duplicates.

Example:

"aaabbcc" → "abc"

✔ Test Cases
Test 1
Input: "aaabbcc"
Output: "abc"

Test 2
Input: "aabbaa"
Output: "aba"*/
import java.util.*;
public class Remove {
    public static void main(String[] args) {
        String s =  "aaabbcc";
        Map<Character,Integer> hm = new LinkedHashMap<>();
        for(Character ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }
        s="";
        for(Character ch:hm.keySet()){
            s=s+ch;
        }
        System.out.println(s);
    }
}
