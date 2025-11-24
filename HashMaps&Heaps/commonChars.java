/*
1002. Find Common Characters
Solved
Easy
Topics
premium lock icon
Companies
Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

 

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]

 */
import java.util.*;

public class commonChars {
    //fill count array 
    // private static void fca(String s,int[] f){
    //     for(char ch:s.toCharArray()){
    //         f[ch-'a']++;
    //     }
    // }
    // public static  List<String> commonChars(String[] words) {
    //     List<String> result = new ArrayList<>();
    //     int size = words.length;
    //     int[] freq = new int[26];
    //     fca(words[0],freq);
    //     for(int i=1;i<words.length;i++){
    //         int[] temp = new int[26];
    //         fca(words[i],temp);
    //         for(int j=0;j<26;j++){
    //             freq[j] = Math.min(freq[j],temp[j]);
    //         }
    //     }
    //     for(int  i=0;i<26;i++){
    //         if(freq[i]>0){
    //             for(int j=0;j<freq[i];j++){
    //                 result.add(String.valueOf((char)(i+'a')));
    //             }
    //         }
    //     }
    //     return result; 
    // }



    public static void fca(String word,int[] freq){
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            freq[ch-'a']++;
        }
    }

    public static List<String> commonChars(String[] words){
        List<String> result = new ArrayList<>();
        int freq[] = new int[26];
        fca(words[0],freq);
        for(int i=1;i<words.length;i++){
            int  temp[] = new int[26];
            fca(words[i],temp);
            for(int  j=0;j<26;j++){
                freq[j] = Math.min(freq[j],temp[j]);
            }
        }
        for(int i=0;i<26;i++){

            if(freq[i]>0){
                for(int j=0;i<freq[i];j++){
                    result.add(String.valueOf((char)i+'a'));
                }
            }
        }
        return result;

    }

    
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        String words[] = new String[]{"bella","label","roller"};
        li = commonChars(words);
        for(String s:li){
            System.out.print(s+" ");
        }

        }
}
