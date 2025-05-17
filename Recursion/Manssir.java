class Manssir {
    public static int nums(int m,int n){
        int z =  nums(m,(n/2)) * nums(m,(n/2));
        if(n==0){
            return z;
        }        
        // System.out.println(m,n);
        return  nums(m, (n/2));
    }
    public static void main(String[] args) {
        int n=2,i=16;
        int x=nums(n,i);
        System.out.println(x);
    }
}