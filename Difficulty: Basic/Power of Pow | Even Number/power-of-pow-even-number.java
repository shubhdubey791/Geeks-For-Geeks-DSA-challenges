class Solution {
    public int sumSqEven(int n) {
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum+= Math.pow(2*i,2);
        }
        return sum;
    }
};