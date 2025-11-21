class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) { //pop and peek  efficient code o(1)

        while (st.size() > 0) {
            helper.push(st.pop());
        }
        st.push(x);
        while (helper.size() > 0) {
            st.push(helper.pop());
        }

    }

    public int pop() {
        return st.pop();

    }

    public int peek() {
        return st.peek();

    }

    public boolean empty() {
        if (st.size() == 0)
            return true;
        else
            return false;

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */