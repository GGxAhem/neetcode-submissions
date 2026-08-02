class MinStack {
        Stack<Integer> stack = null;
        Stack<Integer> minstack = null;

    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
      stack.push(val);
      if(minstack.isEmpty()){
        minstack.push(val);
      }
      else{
            minstack.push(Math.min(val, minstack.peek()));
      }
    }
    
    public void pop() {
      stack.pop(); 
      minstack.pop(); 
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(!minstack.isEmpty()){
            return minstack.peek();
        }
        return -1;
    }
}
