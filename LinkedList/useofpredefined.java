package LinkedList;
import java.util.*;

public class useofpredefined {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.addFirst("A");
        ll.addFirst("is");
        System.out.println(ll);

        System.out.println(ll.size());
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i)+" ");

        }
        ll.removeFirst();
        System.out.println(ll);

        
    }
    
}
