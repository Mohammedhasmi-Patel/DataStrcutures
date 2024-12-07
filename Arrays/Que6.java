class Solution {
    public void binSort(int[] arr) {
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
public void binSort(int[] arr) {
    int zeroCount = 0;
    for (int num : arr) {
        if (num == 0) {
            zeroCount++;
        }
    }
    for (int i = 0; i < arr.length; i++) {
        arr[i] = (i < zeroCount) ? 0 : 1;
    }
}