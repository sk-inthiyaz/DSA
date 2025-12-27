// package String;
/*

e -> a
g -> d
g -> d

 /* 
class Solution {
    public boolean isIsomorphic(String s, String t) {
        TreeMap<Character, Character> tms = new TreeMap<>();
        for(int i=0;i<s.length();i++){
            Character sc = s.charAt(i);
            Character tc = t.charAt(i);
            if(!tms.isEmpty()){
                if(!tms.containsKey(sc)){
                    tms.put(sc,tc);
                }
                else{
                    if(tms.get(sc)!=tc){
                        return false;
                    }
                }
            }
            else{
                tms.put(sc,tc);
            }
        }
        return true;
    }
} */


   

import java.util.*;
// package String;
 
 public class isIsomorphic {
 
    public boolean isIsomorphic(String s, String t) {
        TreeMap<Character, Character> tms = new TreeMap<>();
        int c = 0;
        for(int i=0;i<s.length();i++){
            Character sc = s.charAt(i);
            Character tc = t.charAt(i);
            if(!tms.isEmpty()){
                if(!tms.containsKey(sc)){
                    tms.put(sc,tc);
                    c++;
                }
                else{
                    if(tms.get(sc)!=tc){
                        return false;
                    }
                }
            }
            else{
                tms.put(sc,tc);
                c++;
            }
        }
        if(tms.size()==s.length()){
            for(Map.Entry<Character,Character> entry:tms.entrySet()){
                if(entry.getKey()!=entry.getValue()){
                    return false;
                }
            }
        }
        return true;
    }

     public static void main(String[] args) {
        isIsomorphic isomorphic = new isIsomorphic();
        System.out.println(isomorphic.isIsomorphic("egg", "add")); // true
        System.out.println(isomorphic.isIsomorphic("foo", "bar")); // false
        System.out.println(isomorphic.isIsomorphic("paper", "title")); // true
        System.out.println(isomorphic.isIsomorphic("badc", "baba")); // false
        System.out.println(isomorphic.isIsomorphic("badc", "badc")); //  true

    }
    }