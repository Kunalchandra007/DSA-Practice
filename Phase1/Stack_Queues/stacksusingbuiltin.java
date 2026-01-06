package Stack_Queues;
import java.util.*;
public class stacksusingbuiltin {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}
