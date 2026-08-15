class Solution {
    public double findMedian(int[] arr) {
        int n = arr.length;
        double median;
        Arrays.sort(arr);
        if(n%2!=0){
         median = arr[((n+1)/2 -1) ];
         return median;
            
            
        }
        else {
            
          median  =(double)((arr[(n/2)-1] + arr[(n/2)]))/2;  
            return median;
            
            
        }
        
    }
}
