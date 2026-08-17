class Solution {
    static int clockSum(int x, int y) {
        int sum = x +y;
        if(sum <=12)
        return sum;
        else if(sum%12==0)
        return 12;
        else 
        return sum % 12;
        
    }
}