// equilibruim point in array




class Solution {
    public static int equilibriumPoint(int arr[]) {
        
        if(arr.length==1) return 1;
        if(arr.length==2) return -1;
        
    
        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;i<arr.length;i++){
            totalSum += arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            rightSum = totalSum - arr[i] - leftSum;
            
            if(rightSum==leftSum){
                return i+1;
            }
            
            leftSum += arr[i];
        }
    return -1;
    }
}


