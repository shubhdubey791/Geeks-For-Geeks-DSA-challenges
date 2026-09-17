class Solution {
    static void printa(int n){
        if(n==0)
        return ;
        printa(n-1);
        System.out.print(n + " ");
    }
    public void printTillN(int n) {
    
        printa(n);
    }
}