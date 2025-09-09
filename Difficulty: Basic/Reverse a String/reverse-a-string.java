// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder str = new StringBuilder();
        
        int n = s.length()-1;
        
        for(int i=n;i>=0;i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}