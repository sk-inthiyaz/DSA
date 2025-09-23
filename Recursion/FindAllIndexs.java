
import java.util.ArrayList;

class FindAllIndexs{
    public static ArrayList<Integer> fai(int[] arr,int t,int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        if(arr[i]==t){
            list.add(i);
        }
        ArrayList<Integer> ansfromBelowCalls = fai(arr, t, i+1);
        list.addAll(ansfromBelowCalls);
         return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = fai(new int[]{1,2,3,4,4,8},4,0);
        System.out.println(a);
    }
}