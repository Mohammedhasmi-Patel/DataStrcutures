
// this is bruteforce O(n)
class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int max = -1;
            for(int j=i+1;j<n;j++){
               max =  Math.max(arr[j],max);
            }
            ans.add(max);
        }
        return ans;
    }
}

// efficient O(n)

class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int max = -1;

        for (int i = n - 1; i >= 0; i--) {
            ans.add(max);
            max = Math.max(max, arr[i]); 
        }

        int start = 0;
        int end = n-1;
        
        while(start<end){
            int temp = ans.get(start);
            ans.set(start, ans.get(end));
            ans.set(end, temp);
            start++;
            end--;

        }
        
        return ans;

    }
}