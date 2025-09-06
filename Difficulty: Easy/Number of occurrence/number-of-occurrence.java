class Solution {
    int countFreq(int[] arr, int target) {
        // will divide the functions into two that is one to search left and one to 
        // search right
        
        int first = findFirst(arr, target);
        if (first == -1) return 0; // target not found
        int last = findLast(arr, target);
        
        return last - first + 1;
    }
    
    // For searching only the left subarray
    private int findFirst(int[] arr, int target){
        int start = 0, end = arr.length - 1, ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    // For searching the entire right subarray
    private int findLast(int[] arr, int target){
        int start = 0, end = arr.length - 1, ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    
}
