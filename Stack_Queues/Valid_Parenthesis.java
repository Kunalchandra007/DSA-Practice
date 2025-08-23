package Stack_Queues;
import java.util.*;
public class Valid_Parenthesis {
    public static boolean isvalid(String s){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('|| ch=='['||ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty())return false;
                char top=st.peek();
                st.pop();
                if((ch==')'&& top!='(')||
                    (ch==']'&&top!='[')||
                     (ch=='}'&& top!='{')){
                        return false;

                     }
            }
        }
        return st.isEmpty();

    }
    public static void main(String[] args) {
        String str1="()[]{}";
        String str2="([]}";
        System.out.println(str1+"->"+isvalid(str1));
        System.out.println(str2+"->"+isvalid(str2));
    }

    }
    
