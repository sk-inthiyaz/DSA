public class c_negative {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{-3, -2, -1,  1},{-2, -1,  2,  3},{-1,  1,  3,  5}};
        int m=3;
        int n=4;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]<0){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
