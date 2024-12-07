class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        int sum = 0;
        
        if(date % 2 == 0){
            for(int i=0;i<car.length;i++){
                if(car[i]%2==1){
                    sum += fine[i];
                }
            }
            return sum;
        }
        else{
            for(int i=0;i<fine.length;i++){
                if(car[i]%2==0){
                    sum += fine[i];
                }
            }
            return sum;
        }
    }
}