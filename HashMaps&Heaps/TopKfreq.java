import java.util.*;
class TopKfreq{
    public int[] topKFrequent(int[] nums, int k){
        int arr[]  = new int[k];
        HashMap<Integer,Integer> hm =  new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> sortedEntries = new ArrayList<>(hm.entrySet());
        sortedEntries.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
        int i = 0;
        for(Map.Entry<Integer,Integer> entry:sortedEntries){
            if(i<k){
                arr[i]=entry.getKey();
                i++;
            }
            else{
                break;
            }
        }
        return arr;

    }
}