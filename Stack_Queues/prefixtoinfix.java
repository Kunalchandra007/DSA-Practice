package Stack_Queues;
import java.util.*;
public class prefixtoinfix {
    public static String convert(String exp){
        Stack<String>st=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char c=exp.charAt(i);

            if(Character.isLetterOrDigit(c)){
                st.push(Character.toString(c));
            }else {
                if (st.size() < 2) {
                    throw new IllegalArgumentException("Invalid prefix expression: " + exp);
                }
                String t1 = st.pop();
                String t2 = st.pop();
                String result = "(" + t1 + c + t2 + ")";
                st.push(result);
            }
        }
        if (st.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression: " + exp);
        }
        return st.pop();

       

    }
    public static void main(String[] args) {
        String prefix = "*+PQ-MN";  
        System.out.println("Postfix expression: " + prefix);
        System.out.println("Converted expression: " + convert(prefix));
    }
    
}
