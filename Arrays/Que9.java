class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols - 1;
        int mid;

        while(start<=end){
            mid = start+(end-start)/2;
            if(matrix[mid/cols][mid%cols]>target){
                // moving to forward
                end = mid - 1;
            }
            else if(matrix[mid/cols][mid%cols]<target){
                start = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}