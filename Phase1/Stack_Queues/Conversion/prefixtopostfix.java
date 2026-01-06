package Stack_Queues.Conversion;
import java.util.*;
public class prefixtopostfix {
    public static String convert(String exp){
        Stack<String>st=new Stack<>();

        for(int i=exp.length()-1;i>=0;i--){
            char c=exp.charAt(i);

            if(Character.isLetterOrDigit(c)){
                st.push(c+"");
            }else{
                String op1=st.pop();
                String op2=st.pop();
                String temp=op1+op2+c;
                st.push(temp);
            }
            
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String prefix="/-AB*+DEF";
        System.out.println(convert(prefix));
    }
}
