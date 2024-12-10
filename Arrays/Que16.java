/*
      TC -> O(n)
      SC -> O(n)

      where n is length of arraylist




*/



class Solution {
    void rearrange(ArrayList<Integer> arr) {
        
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> nag = new ArrayList<>();
        
        for(int num : arr){
            if(num<0){
                nag.add(num);
            }else{
                pos.add(num);
            }
        }
        
        
     if (pos.isEmpty() || nag.isEmpty()) {
         return;
     }
     
     
     int idx = 0;
     int posIndex = 0;
     int nagIndex = 0;
     
     while(posIndex<pos.size() && nagIndex<nag.size() ){
            arr.set(idx++,pos.get(posIndex++));
            arr.set(idx++,nag.get(nagIndex++));
     }
     
     while(posIndex<pos.size()){
        arr.set(idx++,pos.get(posIndex++));

     }
     
     while(nagIndex<nag.size()){
        arr.set(idx++,nag.get(nagIndex++));

     }


    }
}