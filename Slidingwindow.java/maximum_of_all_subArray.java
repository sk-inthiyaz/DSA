
import java.util.*;

public class maximum_of_all_subArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,-1,-3,5,3,6,7};
        int k=3;
        int r=0,l=0,wmax=0;
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        q.add(r);
        while(r<arr.length){
            while(q.size()>0 && q.back)
            if(arr[r]<q.peek()){
                q.add(arr[r]);
            }
            else{
            }
            if(r-l+1<k){
                r++;
            }
            else if(r-l+1==k){
                ans.add(q.peek());
                wmax = 
                if(q.isEmpty()) add.add(arr[r]);
            }
        }
        for(int i:q){
                System.out.println(i);
            }

    }
}
