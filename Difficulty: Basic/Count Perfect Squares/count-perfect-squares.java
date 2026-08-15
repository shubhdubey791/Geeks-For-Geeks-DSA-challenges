class Solution {
    static int countSquares(int n) {
        int count = 0;
        for(int i= 1;i<n; i++)
        {
            if(i<Math.pow(n,0.5))
            count++;
            else
            break;
        }
        return count;
    }
}  