class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        int unique = 0;
        int indx = 1;
        
        while(indx<arr.length){
            if(arr[indx]!=arr[unique]){
                arr[unique+1] = arr[indx];
                unique++;
                
            }
            indx++;
        }
        return unique+1;
    }
}
