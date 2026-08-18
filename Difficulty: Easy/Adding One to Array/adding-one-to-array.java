class Solution {
    
    Vector<Integer> addOne(int[] arr) {
        Vector<Integer> v = new Vector<>();
        int carry = 1;
        for(int i= arr.length-1;i>=0;i--){
           
            
               int  sum = arr[i] +carry;
                v.add(sum%10);
                carry = sum/10;
                
                
            
        }
        if(carry == 1)
           v.add(carry); 
           Collections.reverse(v);
          return v;
    }
}