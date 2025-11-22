import java.util.*;
class fuc {
    public static  int firstUniqChar(String s) {
        Map<Character,Integer> tm = new LinkedHashMap<>();
        for(Character ch:s.toCharArray()){
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        System.out.println(tm);
        char c='\0';
        for(Map.Entry<Character,Integer> entry:tm.entrySet()){
            if(entry.getValue()==1){
                c = entry.getKey();
                System.out.println(c);
                break;
            }
        }
        if(c!='\0'){
            for(int i=0;i<s.length();i++){
                if(c==s.charAt(i)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    // Test Case 1
    String s1 = "leetcode";
    // int g = Integer.MIN_VALUE
    int result1 = firstUniqChar(s1);
    System.out.println("Input: s = \"" + s1 + "\"");
    System.out.println("Output: " + result1);
    System.out.println("Expected Output: 0\n");

    // Test Case 2
    String s2 = "loveleetcode";
    int result2 = firstUniqChar(s2);
    System.out.println("Input: s = \"" + s2 + "\"");
    System.out.println("Output: " + result2);
    System.out.println("Expected Output: 2");
}

}