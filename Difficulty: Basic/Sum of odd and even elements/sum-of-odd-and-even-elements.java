class Solution {
    public int[] findSum(int n) {
    
       int even = n/2;
       int odd = n-even;
      
      int oddsum = odd*odd;
     int  evensum = even*(even+1);
       int[] ans = new int[2];
       ans[0] = oddsum;
       ans[1] =evensum;
       
       return ans;
       
       
       
       }
}