/*
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> h = new HashMap<>();
        for(String s : strs){
            int arr[] = new int[26];
            for(char c : s.toCharArray()){
                arr[c-'a']++;
            }
            String key = Arrays.toString(arr);
            h.putIfAbsent(key,new ArrayList<>());
            h.get(key).add(s);
        }
        return new ArrayList(h.values());
    }
}
 */
class GroupAnagram{
    public static void main(String[] args) {
        // int[] arr = {5,20,4,3,4,4,5,5};//5
        int[] arr = {1,2,3,3,4,5,4,5,5,5};//3
        
        // int[] arr = {20,100,3,4,4,5,5};//20
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){            
                tmax = smax;
                smax = max;
                max=arr[i];    
            }
            if(smax<arr[i] && arr[i]!=max){
                tmax = smax;
                smax = arr[i];
                
            }
            if(tmax<arr[i] && arr[i]!=smax && arr[i]!=max){
                tmax = arr[i];
            }
        }
        System.out.println(smax);
        System.out.println(tmax);
    }

    // public static void main(String[] args) {
    //     String[] strs = {"eat","tea","tan","ate","nat","bat"};
    //     HashMap<String, List<String>> h = new HashMap<>();
    //     for(String s : strs){
    //         int arr[] = new int[26];
    //         for(char c : s.toCharArray()){
    //             int asv = c;
    //             System.out.print(asv+" ");
    //             System.out.print(c-'a' +" \n");
    //             arr[c-'a']++;
    //         }
    //         String key = Arrays.toString(arr);
    //         h.putIfAbsent(key,new ArrayList<>());
    //         h.get(key).add(s);
    //     }
    //     System.out.println(new ArrayList(h.values()));
        // int sl = strs.length;
        // String[] b = new String[sl];
        // int i = 0;
        // for(String s:strs){
        //     char c[] = s.toCharArray();
        //     Arrays.sort(c);
        //     b[i] = new String(c);
        //     System.out.println(b[i]);
        //     i++;
        // }
        // HashMap<String,String> hm = new HashMap<>();
        // for(int j=0;j<sl;j++){
        //     hm.put(strs[j],b[j]);
        // }
        // System.out.println(hm);
    // }
}