class Solution {
    // Function to sort the binary array in non-decreasing order
    public void binSort(int[] arr) {
        // code here
        int i = 0;
        int zeroCount = 0;
        
        while(i<arr.length){
            if(arr[i]==0){
                zeroCount++;
            }
            i++;
        }
        
        i = 0;
        
        while(zeroCount>0){
            arr[i] = 0;
            zeroCount--;
            i++;
        }
        
        while(i<arr.length){
            arr[i]=1;
            i++;
        }
        
        
    }
}
