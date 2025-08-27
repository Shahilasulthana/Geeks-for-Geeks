import java.util.*;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            // Case 1: whole subarray [0..i] has sum k
            if (prefixSum == k) {
                maxLen = i + 1;
            }

            // Case 2: some subarray [j+1..i] has sum k
            if (map.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum - k));
            }

            // Only store first occurrence of prefixSum
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
}
