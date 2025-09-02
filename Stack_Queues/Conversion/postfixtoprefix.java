package Stack_Queues.Conversion;
import java.util.*;

public class postfixtoprefix {
    public static String convert(String exp){
        Stack<String>st=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);

            if(Character.isLetterOrDigit(c)){
                st.push(c+"");
            }else{
                String op1=st.pop();
                String op2=st.pop();
                String temp=c+op2+op1;
                st.push(temp);
                        }
        }
      
        
        return st.pop();
    }
    public static void main(String[] args) {
        String postfix="ABC/-AK/L-*";
        System.out.println("Prefix:"+convert(postfix));
    }

    }
    

