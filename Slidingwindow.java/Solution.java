class Solution {
    private static char flip(char f){
        if(f=='1') return '0';
        return '1';
    }
    public static  int minFlips(String s) {
        int n = s.length();
        s = s + s;
        String alt1="",alt2="";
        for(int i=0;i<n;i++){
            if(i%2==0) alt1 += "0";  else alt1="1";
            if(i%2==0) alt2 += "1";  else alt1="0";
        }
            int res = n;
            int diff1=0,diff2 = 0;
            int l=0;
            for(int r=0;r<n;r++){
                if(s.charAt(r)!=alt1.charAt(r)){
                    diff1+=1;
                }
                if(s.charAt(r)!=alt2.charAt(r)){
                    diff2+=1;
                }
                if((r-1+1)>n){
                    if(s.charAt(l)!=alt1.charAt(l)) diff1=diff1-1;
                    if(s.charAt(l)!=alt2.charAt(l)) diff2=diff2-1;
                    l=l+1;
                }
                if((r-l+1)==n){
                    res = Math.min(res,diff1);
                    res = Math.min(res,diff2);
                }

            }
        
        System.out.println(res);
        return 0;
    }
    public static void main(String[] args) {
        int n = minFlips("01001001101");
        System.out.println(n);
    }

}
    
