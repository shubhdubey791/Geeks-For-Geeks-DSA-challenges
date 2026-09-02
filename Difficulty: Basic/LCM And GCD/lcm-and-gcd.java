class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int[] ans  = new int[2];
        int product = a*b;
        while(b>0){
            int rem  = a%b;
            a= b;
            b= rem;
            
            
            
            
            
        }
        int lcm = product/a;
        ans[0] = lcm;
        ans[1] = a;
        
        return ans;
    }
}