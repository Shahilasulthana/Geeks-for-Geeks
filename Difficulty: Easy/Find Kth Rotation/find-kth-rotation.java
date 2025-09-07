class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int ans = Integer.MAX_VALUE;
        int index = -1;
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            // if the entire array is sorted
            if(arr[start] <= arr[end]){
                if(arr[start] < ans){
                    index = start;
                    ans = arr[start];
                }
                break;
            }
            // if left array is sorted
            if(arr[start] <= arr[mid]){
                if(arr[start] < ans){
                    index = start;
                    ans = arr[start];
                }
                start = mid + 1;
            }
            //if right array is sorted
            else{
                if(arr[mid] < ans){
                    index = mid;
                    ans = arr[mid];
                }
                end = mid - 1;
            }
        }
        return index;
        
    }
}