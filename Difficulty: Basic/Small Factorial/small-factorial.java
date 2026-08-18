class Solution {
    static long fact(int p){
        
        if(p==0)
        return 1;
        else 
        return p*fact(p-1);
    }
    public long find_fact(int n) {
    long factorial = fact(n);
        return factorial;
    }
}