class MyStack {
    Queue<Integer> input;
    Queue<Integer> output;
    

    public MyStack() {
        input = new LinkedList<>();
        output = new LinkedList<>();
    }
    
    public void push(int x) {
        output.offer(x);

        while(!input.isEmpty()){
            output.offer(input.poll());
        }

        Queue<Integer> temp = input;
        input = output;
        output = temp;

    }
    
    public int pop() {
        return input.poll();
    }
    
    public int top() {
        return input.peek();
    }
    
    public boolean empty() {
        return input.isEmpty();
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
