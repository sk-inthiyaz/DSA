import java.util.HashSet;

public class basic {
    public static int unique(int arr[],int num){
        // HashSet set<Integer> = new HashSet<>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < num; j++) {
                if(j<i){
                    set.add(arr[j]);
                }
                else if(i<num){
                    continue;
                }
                else{
                    set.add(arr[j]);
                }
            }
            System.out.println(set);
            num++;
        }
        // System.out.println(set);
        return 0;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,7,7,8};
        System.out.println(unique(arr, 2));
    }
}
