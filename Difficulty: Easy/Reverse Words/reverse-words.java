class Solution {
    public String reverseWords(String s) {
        // Code here
        ArrayList<String> result = new ArrayList<>();
        String[] splitted = s.split("\\.");
        
        for (String word : splitted){
            if(!word.isEmpty()){
                result.add(word);
            }
            
        }
        
        Collections.reverse(result);
        return String.join(".", result);
    }
}
