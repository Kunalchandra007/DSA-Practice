package Stack_Queues;

import java.util.*;

public class stackusingqueue {

    static class MyStack {
        // Field initializer (queue created directly here)
        private Queue<Integer> q = new LinkedList<>();

        // push element onto stack
        public void push(int x) {
            q.add(x);
            // rotate queue to move new element to front
            for (int i = 0; i < q.size() - 1; i++) {
                q.add(q.poll());
            }
        }

        // pop element from stack
        public int pop() {
            return q.poll(); // removes head (acts as top)
        }

        // peek at top element
        public int top() {
            return q.peek();
        }

        // check if stack is empty
        public boolean empty() {
            return q.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top());   // 30
        System.out.println(st.pop());   // 30
        System.out.println(st.top());   // 20
        System.out.println(st.empty()); // false
    }
}
