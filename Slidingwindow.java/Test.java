
 /*
ADOBECODEBANC
ABC

*/
import java.util.*;
class Test{
    public static void main (String[] args) {
        HashMap<Character,Integer> hm = new HashMap<>();
        String s = "ADOBECODEBANC",t = "ABC";
        int l=0,_firstIndexChar=0,_secondIndexChar=0,c=0,currentlength=0,minlength=Integer.MAX_VALUE;
        String minsubstring="";
        char firstchar;
        for(int r=0;r<s.length();r++){
            char rchar = s.charAt(r);
            for(int i=0;i<t.length();i++){
                char tchar = t.charAt(i);
                if(rchar==tchar){
                    hm.put(tchar,hm.getOrDefault(tchar,0)+1);
                    c++;
                    if(c==1)  _firstIndexChar = r;
                    if(c==2)  _secondIndexChar = r;
                    System.out.println("l: "+l+" r: "+r+" c:"+c);
                }
                if(c==3){
                    currentlength = r-l+1;
                    System.out.println("Minlength:"+minlength+" Current length: "+currentlength);
                    if(minlength>currentlength){
                        minsubstring = s.substring(l,r);
                        minlength = currentlength;
                    }
                    firstchar = s.charAt(_firstIndexChar);
                    int x = hm.get(firstchar);
                    x--;
                    hm.put(firstchar,x);
                    l=_secondIndexChar;
                    c=0;
                }
            }
        }
        System.out.print(minsubstring);
        
    }
}
