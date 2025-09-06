// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr); // sorted array
        
        // Implement Binary search on the sorted array to find the floor and ceil of
        // the given target element from the array
        
        int floor = -1;
        int ceil = -1;
        
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == x){
                return new int[]{x, x};
            }
            else if(arr[mid] < x){
                floor = arr[mid];
                start = mid + 1;
            }
            else{
                ceil = arr[mid];
                end = mid - 1;
            }
        }
       return new int[]{floor, ceil};
    }
}
