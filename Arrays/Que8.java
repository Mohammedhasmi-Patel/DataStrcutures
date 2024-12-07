class Solution {
    public static int missingNumber(int n, int[] arr) {
        
        int totalSum = n*(n+1)/2;
        
        for(int i=0;i<arr.length;i++){
            totalSum -= arr[i];
        }
        return totalSum;
    }
}
        
