class MinStack {

    Deque<Integer> stack ;
    Deque<Integer> theMinStack;

    public MinStack() {
       stack = new LinkedList<>();
       theMinStack = new LinkedList<>();
    }

    public void push(int val) {
        if (theMinStack.isEmpty()){
            theMinStack.push(val);
        }else {
            theMinStack.push(theMinStack.peek() < val ? theMinStack.peek() : val);
        }

        stack.push(val);
    }

    public void pop() {
        this.stack.pop();
        this.theMinStack.pop();
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {

        return theMinStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */