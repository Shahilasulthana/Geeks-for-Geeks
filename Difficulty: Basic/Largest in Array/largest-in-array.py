class Solution:
    def largest(self, arr):
        # code here
        max = 0
        n = len(arr)
        for i in range(0, n):
            if (arr[i] > max):
                max = arr[i]
        return max;