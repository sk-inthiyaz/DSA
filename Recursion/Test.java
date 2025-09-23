class Test{
    public static int d(String n,int l){
        if(l==-1){
            return 0;
        }
        char c = n.charAt(l);
        int i = c - '0';
        System.out.println("i: "+i);
        int z = i * (int)Math.pow(2,n.length()-1 - l);
        System.out.println(z);
        return (i * (int)Math.pow(2,n.length()-1 - l) +  d(n,--l));
        
    }
    public static void main (String[] args) {
        /* code */
        String s = "1011";
        int l = s.length();
        System.out.print(d(s,l-1));
    }
    
}