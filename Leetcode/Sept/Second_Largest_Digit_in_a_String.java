//1796. Second_Largest_Digit _in_a_String
class  Second_Largest_Digit_in_a_String{
    public static void main(String[] args) {
        String s = "abc1111";
        int fmax = -1;
        int smax = -1;
        int flag =0,p=0;
        for(char c:s.toCharArray()){
            if(!((int)c>=97 && (int)c<=122)){
                int num = c - '0';//For real value
                if(fmax<num){
                    smax = fmax;
                    fmax = num;
                }
                else if(smax<num && num!=fmax){
                    System.out.println("hi");
                    smax = fmax;
                }
            }
        }
       System.out.println(smax);
    }
}