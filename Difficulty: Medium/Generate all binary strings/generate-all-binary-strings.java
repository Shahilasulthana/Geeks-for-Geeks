class Solution {
    public ArrayList<String> binstr(int n) {
        ArrayList<String> ans = new ArrayList<>();
        helper(ans, "", n);
        return ans;
    }
    void helper(ArrayList<String> ans, String curr, int n){
        //break condition / edge case
        if(curr.length() == n){
            ans.add(curr);
            return;
        }
        // recursive call
        helper(ans, curr + '0', n);
        helper(ans, curr + '1', n);
    }
}
