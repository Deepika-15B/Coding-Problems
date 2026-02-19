class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.offer(x);   // Step 1: add to queue
        int size = q.size();

        // Step 2: rotate the queue except the new element
        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();  // front element
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
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
 