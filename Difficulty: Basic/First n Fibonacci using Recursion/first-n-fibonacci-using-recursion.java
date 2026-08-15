class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        int[] ans = new int[n];
        for(int i = 0; i<n;i++)
        {
            if(i==0)
            ans[i]=0;
            else if(i==1)
            ans[i] = 1;
            else{
                ans[i] = ans[i-1] +ans[i-2];
                
                
            }
            
            
            
            
        }
      return ans;  
    }
}