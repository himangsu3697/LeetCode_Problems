class MinStack {
    ArrayList <Integer> list;
    int min;
    public MinStack() {
        this.list = new ArrayList<>();
        this.min = Integer.MAX_VALUE;
    }

    public void push(int value) {
        if(min > value) {
            min = value;
        } 
        list.add(value);
    }
    
    public void pop() {
        if(list.size() == 0) {
            return;
        }
        if(list.remove(list.size()-1) == min) {
            min = Integer.MAX_VALUE;
            for(int i=0; i<list.size(); i++) {
                if(min > list.get(i)) {
                    min = list.get(i);
                }
            }
        }
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */