class Solution {
    static long fact(int a){
        if(a==0)
        return 1;
        else
        return a*fact(a-1);
    }
    public long nPr(int n, int r) {
        long p = fact(n)/fact(n-r);
        return p;
    }
}