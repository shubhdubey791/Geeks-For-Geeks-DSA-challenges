class Solution {
    public static int findMean(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i= 0;i<n; i++){
            
            sum = sum +arr[i];
            
        }
        
        int mean  =(int) Math.floor(sum/n);
        return mean;
    }
}