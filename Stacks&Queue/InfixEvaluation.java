import java.util.*;
public class InfixEvaluation {
    public static int precedence(char optr){
        if(optr=='-' || optr=='+') return 1;
        else return 2;//optr=='*' || '/'
    }
    public static int operation(int v1,int v2,char optr){
        if(optr=='+') return v1+v2;
        else if(optr=='-') return v1-v2;
        else if(optr=='*') return v1*v2;
        else return v1/v2; // optr=='/'
    }
    public static void main(String[] args) {
        String exp = "2+(5-3*6/2)";
        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optrs = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='(') {
                optrs.push(ch);
            }
            else if(Character.isDigit(ch)){
                opnds.push(ch-'0');
            }
            else if(ch==')'){
                while(optrs.peek()!='('){
                    char optr = optrs.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int opv = operation(v1, v2, optr);//operation value
                    opnds.push(opv);
                }
                optrs.pop();
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(optrs.size()>0 && optrs.peek()!='(' && precedence(ch)<=precedence(optrs.peek())){
                    char optr = optrs.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int opv = operation(v1, v2, optr);//operation value
                    opnds.push(opv);
                }
                optrs.push(ch);
            }
        }
            while(!optrs.isEmpty()){
                    char optr = optrs.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int opv = operation(v1, v2, optr);//operation value
                    opnds.push(opv);
                }
            System.out.println(opnds.peek());
    }
}
