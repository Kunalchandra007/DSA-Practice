package Stack_Queues;
import java.util.*;
public class queueusingstacks {
    private Stack<Integer>s1,s2;

    public  queueusingstacks(){
        s1=new Stack<>();
        s2=new Stack<>();
    }
    public void push(int x){
        s1.push(x);
    }
    public int pop(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public int peek(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    public boolean empty(){
        return s1.isEmpty() && s2.isEmpty();
    }
    public static void main(String[] args) {
        queueusingstacks obj=new queueusingstacks();
        obj.push(2);
        obj.push(3);
        System.out.println(obj.peek());
        obj.push(1);
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());
        System.out.println("Empty"+obj.empty());
    }
}

