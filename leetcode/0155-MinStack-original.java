class MinStack {
    int size;
    ArrayList<Integer> list;
    ArrayList<Integer> mins;
    
    /** initialize your data structure here. */
    public MinStack() {
        size = 0;
        list = new ArrayList<Integer>();
        mins = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        list.add(x);
        if(size==0){mins.add(x);}
        else if(x < mins.get(size - 1)){ mins.add(x);}
        else{mins.add(mins.get(size - 1));}
        size++;
    }
    
    public void pop() {
        if(size == 0){return;}
        list.remove(--size);
        mins.remove(--size);
    }
    
    public int top() {
        return list.get(size - 1);
    }
    
    public int getMin() {
        return mins.get(size-1);
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