
import java.util.*;
class re{
    

public static char[]  reverse(char arr[],int l,int r){
    if(!(l<r)){
        return arr;
    }
    System.out.println(l+" "+ r);
    char temp = arr[l];
    arr[l] =arr[r];
    arr[r] = temp;
    l++;
    r--;
    return reverse(arr,l,r);
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);x
        String s = sc.next();
        char arr[] = s.toCharArray();
        char[] sb = reverse(arr,0,arr.length-1);
        for(char i:sb){
            System.out.print(i+"");
        }
        System.out.println();
        // char
        System.out.println(sb.toString());
    }
    }
    