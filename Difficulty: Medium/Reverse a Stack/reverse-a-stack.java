class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()) return;
        int top = st.pop();
        reverseStack(st);
        reverseInsert(st, top);
    }
    static void reverseInsert(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        reverseInsert(st, x);
        st.push(top);
    }
}
