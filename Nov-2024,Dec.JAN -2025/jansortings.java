public class jansortings {
    //Insertion sort 
    public static void main(String[] args) {
        int a[]=new int[]{7,3,5,4,2,6};
        int key,i,j;
        int n=a.length;
        for(i=1;i<n;i++){
            key=a[i];
            j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for (int k : a) {
            System.out.println(k);
        }
    }
}
