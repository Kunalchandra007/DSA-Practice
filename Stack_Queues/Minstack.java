package Stack_Queues;

import java.util.Stack;

public class Minstack {
    Stack<Long> st = new Stack<Long>();
    Long mini;

    public Minstack() {
        mini = Long.MAX_VALUE;
    }

    public void push(int value) {
        Long val = Long.valueOf(value);
        if (st.isEmpty()) {
            mini = val;
            st.push(val);
        } else {
            if (val < mini) {
                // push encoded value
                st.push(2 * val - mini);
                mini = val;
            } else {
                // normal push
                st.push(val);
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        Long val = st.pop();
        if (val < mini) {
            // restore previous minimum
            mini = 2 * mini - val;
        }
    }

    public int top() {
        Long val = st.peek();
        if (val < mini) {
            return mini.intValue();
        }
        return val.intValue();
    }

    public int getMin() {
        return mini.intValue();
    }

    @Override
    public String toString() {
        return "Stack=" + st.toString() + ", currentMin=" + mini;
    }

    public static void main(String[] args) {
        Minstack st = new Minstack();
        st.push(3);   // stack: [3], min=3
        st.push(2);   // stack: [3,2], min=2
        st.push(1);   // stack: [3,2,encoded], min=1

        System.out.println("Top: " + st.top());     // 1
        System.out.println("Min: " + st.getMin());  // 1

        st.pop();     // remove 1, min=2
        st.push(5);   // stack: [3,2,5], min=2

        System.out.println("Top: " + st.top());     // 5
        System.out.println("Min: " + st.getMin());  // 2

        System.out.println(st); // prints stack and current min
    }
}
