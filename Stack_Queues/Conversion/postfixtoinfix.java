package Stack_Queues.Conversion;
import java.util.*;

public class postfixtoinfix {
    public static String convert(String exp){
        Stack<String> st = new Stack<>();

        for(int i=0; i<exp.length(); i++){
            char c = exp.charAt(i);

            if(Character.isLetterOrDigit(c)){
                st.push(Character.toString(c));
            } else {
                if (st.size() < 2) {
                    throw new IllegalArgumentException("Invalid postfix expression: " + exp);
                }
                String t1 = st.pop();
                String t2 = st.pop();
                String result = "(" + t2 + c + t1 + ")";
                st.push(result);
            }
        }
        if (st.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression: " + exp);
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String postfix = "ab*c+";  
        System.out.println("Postfix expression: " + postfix);
        System.out.println("Converted expression: " + convert(postfix));
    }
}