class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        // Start traversing the array from the last 
        int maxFromRight = arr[n - 1];
        result.add(maxFromRight);
        
        for(int i=n-2;i >= 0; i--){
            if(arr[i] >= maxFromRight){
                result.add(arr[i]);
                maxFromRight = arr[i];
            }
        }
        Collections.reverse(result);
        
        return result;
        
    }
}
