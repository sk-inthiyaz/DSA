/*
n = 4
* * * *
* * *
* *
*
 */
public class pattern1 {
    public static void printT(int r,int c){
        if(r==0 && c==0){
            return;
        }
        if(c==0){
            System.out.println();
            r--;
            c=r;
        }
        else{
            System.out.print("*");
            c--;
        }
        printT(r, c);
        
    }
    public static void main(String[] args) {
        int n = 4;
        printT(n,n);
    }
}
