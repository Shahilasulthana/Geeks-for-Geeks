class Solution:
    def getAlternates(self, arr):
        # Code Here
        result = []
        n = len(arr)
        for i in range(0, n, 2):
            result.append(arr[i])
        return result