class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> stackmin = new Stack<Integer>();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if (stackmin.isEmpty()) {
            stackmin.push(x);
            stack.push(x);
        } else {
            if (x < stackmin.peek()) {
                stackmin.push(x);
            } else {
                stackmin.push(stackmin.peek());
            }
            stack.push(x);   
        }
    }
    
    public void pop() {
        stack.pop();
        stackmin.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stackmin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
