class bubblesort{
    public  static int[] bubblesort(int arr[]){
        int temp,n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            for (int k : arr) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,9,12,6};
        int barr[] = bubblesort(arr);
    }
}