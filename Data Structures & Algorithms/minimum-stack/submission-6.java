class MinStack {

    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;
    Integer minCurr;
    int top;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
        minCurr = Integer.MAX_VALUE;
        top = 0;
    }
    
    public void push(int val) {
        stack.add(val);
        top++;

        if (minCurr >= val) {
            minCurr = val;
            minStack.add(val);
        }        
    }
    
    public void pop() {
        if (stack.get(top - 1).equals(minStack.get(minStack.size() - 1))) {
            minStack.remove(minStack.size() - 1);
            minCurr = minStack.size() == 0 ? Integer.MAX_VALUE : minStack.get(minStack.size() - 1);
        }

        stack.remove(top-1);
        top--;
        
    }
    
    public int top() {
        return stack.get(top - 1);
    }
    
    public int getMin() {
        return minCurr;
    }
}
