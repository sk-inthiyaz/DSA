//Remove a char from a String using a recursion
//input: baccad & char = a
//output: bccd
public class RemoveAChar {
    // public static StringBuilder  Rc(String input,int i,StringBuilder sb,char ch){
    //     if(i==input.length()){
    //         return sb;
    //     }
    //     if(input.charAt(i)!=ch){
    //          sb.append(input.charAt(i));
    //     }
    //     i++;
    //     return Rc(input, i, sb, ch);
    // }


    static String r(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        return ch=='a' ? ""+r(s.substring(1)): ch + r(s.substring(1));
    }
    public static void main(String[] args) {
        StringBuilder c = new StringBuilder();
        // StringBuilder b = Rc("baccad", 0, c, 'a');
        // System.out.println(b.toString());
        String z = r("baccad");
        System.out.println(z);
        
    }
}
