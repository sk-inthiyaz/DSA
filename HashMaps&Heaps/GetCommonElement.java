
import java.util.HashMap;

public class GetCommonElement {
    public static void main(String[] args) {
        int[] a1 = {1,1,2,2,2,3,5};
        int[] a2 = {1,1,1,2,2,4,5};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<a2.length;i++){
            hm.put(a2[i], i);
        }
        for(int i=0;i<a1.length;i++){
            if(hm.containsKey(a1[i])){
                System.out.print(a1[i]+ " ");
                hm.remove(a1[i]);
            }
        }
        // System.out.println(hm);
    }
}
