class Solution {
    public int getSecondLargest(int[] arr) {
        // edge case: if array has less than 2 elements
        if (arr.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                // shift down
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        // if no second largest (like [5,5,5])
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
}
