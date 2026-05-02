class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()) return;
        int top = st.pop();
        sortStack(st);
        sortInserted(st, top);
        
        
    }
    static void sortInserted(Stack<Integer> st, int x){
        if(st.isEmpty() || st.peek() <= x){
            st.push(x);
            return;
        }
        int top = st.pop();
        sortInserted(st, x);
        st.push(top);
    }
}