class Solution {
    int findMissing(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        int diff = (arr[arr.length - 1] - arr[0]) / arr.length; 
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int expected = arr[0] + mid * diff;
            
            if (arr[mid] == expected) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[start - 1] + diff;
    }
}
