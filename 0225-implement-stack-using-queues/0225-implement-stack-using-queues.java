class MyStack {
    Queue<Integer> Q1;
    Queue<Integer> Q2;
    public MyStack() {
        Q1 = new LinkedList<>();
        Q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        Q2.add(x);
        while(!Q1.isEmpty()){
            Q2.add(Q1.remove());
        }
        Queue<Integer> Temp = Q1;
        Q1 = Q2;
        Q2 = Temp;
    }
    
    public int pop() {
        return Q1.remove();
    }
    
    public int top() {
        return Q1.peek();
    }
    
    public boolean empty() {
        return Q1.isEmpty();
    }
}