public class Theatre_Seating {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,0,1,0,0,0};
        int count=0,f=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            else{
                count=0;
            }
            if(count==4) f++;
        }
        System.out.println(f);
    }
}
