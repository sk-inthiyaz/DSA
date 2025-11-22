import java.util.HashMap;
import java.util.Map;

public class totalfruits {
    public static void main(String args[]){
        //your code goes here
        int[] fruits = new int[]{1,2,1};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<fruits.length;i++){
          hm.put(fruits[i],hm.getOrDefault(fruits[i],0)+1);
        }
        int fg = Integer.MIN_VALUE,sg=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
          System.out.println(entry.getValue());
          if(entry.getValue()>fg){
             sg = fg;
             fg = entry.getValue(); 
          }
          else if(entry.getValue()>sg && entry.getValue()!=fg) sg = entry.getValue();
        }
        System.out.println(fg+sg);
    }
}

