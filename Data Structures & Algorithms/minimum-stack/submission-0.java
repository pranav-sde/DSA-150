class MinStack {
    private List<Integer> st;
    private int minimum;
    private int val;

    public MinStack() {
        st = new ArrayList<>();
        this.minimum = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        this.val = val;
        this.minimum = Math.min(this.minimum, val);
        st.add(val);
    }
    
    public void pop() {
        int n = st.size();
        if(n<=0)
            return;
        st.remove(n-1);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n-1;i++){
            min = Math.min(min, st.get(i));
        }
        if(min == Integer.MAX_VALUE)
            this.minimum = Integer.MAX_VALUE;
        else 
            this.minimum = min;
    }
    
    public int top() {
        int n = st.size();
        if(n>0)
            return st.get(n-1);
        else 
            return -1;
    }
    
    public int getMin() {
        return this.minimum;
    }
}
