class MyStack {
    LinkedList<Integer> que1 = new LinkedList<Integer>();
    LinkedList<Integer> que2 = new LinkedList<Integer>();
    /** Initialize your data structure here. */
    public MyStack() {
        return;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        que1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (que1.size()>1) {
            que2.add(que1.remove());
        }
        int ans =  que1.remove();
        que1 = que2;
        que2 = new LinkedList<Integer>();
        return ans;
    }
    
    /** Get the top element. */
    public int top() {
        while (que1.size()>1) {
            que2.add(que1.remove());
        }
        int ans =  que1.peek();
        que2.add(que1.remove());
        que1 = que2;
        que2 = new LinkedList<Integer>();
        return ans;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return que1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
