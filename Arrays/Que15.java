class Solution {
    int transitionPoint(int arr[]) {
        
        // bruteforce 
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                if(i==0) return 0;
                return i;
            }
        }
        return -1;
    }
}


// optimal binary search
class Solution {
    int transitionPoint(int arr[]) {
        // code here
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<end){
            int mid = start+(end-start)/2;
            
            if(mid==0 && arr[mid]==1){
                return 0;
            }
            
            if(mid==0 && arr[mid]==0) return -1;
            
            if(arr[mid]==0){
                start = mid + 1;
            }
            else if(arr[mid]==1){
                end = mid ;
                
            }
        }
        
        if(start==end && arr[start]!=0) return start;
        return -1;
    }
}

// more readble binary search

class Solution {
    int transitionPoint(int arr[]) {
        // code here
        
        int n = arr.length;
        if(arr[n-1]==0) return -1;
        if(arr[0]==1) return 0;
        
        
        int start = 0;
        int end = n-1;
        
        while(start<end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]==0){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}