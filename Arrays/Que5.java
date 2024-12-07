class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            else if(arr[i]>max){
                max = arr[i];
            }
        }
        
        return new Pair(min,max);
        
    }
}
