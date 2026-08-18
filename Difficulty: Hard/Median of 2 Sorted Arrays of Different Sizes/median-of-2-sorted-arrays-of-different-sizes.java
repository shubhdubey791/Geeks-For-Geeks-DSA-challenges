class Solution {
    public double medianOf2(int a[], int b[]) {
        int[] ans  = new int[a.length+b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        double median;
        
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                ans[k] = a[i];
                k++;
                i++;
            }
            else{
                ans[k] = b[j];
                k++;
                j++;
            }
        }
        
         while(i<a.length ){
              ans[k] = a[i];
                k++;
                i++;
         }
          while(j<b.length ){
              ans[k] = b[j];
                k++;
                j++;
         }
         int n = ans.length;
         if(n%2!=0)
        median =ans[(n+1)/2-1];
        else
        median =((double)(ans[n/2-1] + ans[n/2]))/2;
        return median;
    }
}