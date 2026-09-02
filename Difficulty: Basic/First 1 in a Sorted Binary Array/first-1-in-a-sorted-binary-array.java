class Solution {
    public int firstIndex(int arr[]) {
        int low = 0;
               int high  = arr.length-1;
               int mid;
               while(low<=high){
        mid = (low+high)/2;
        if(arr[mid]==1){
            
            
            while(mid >=0 && arr[mid]==1){
                mid = mid-1;
            }
            
            return mid+1;
        }
        
        else if (arr[mid]>1)
        high = mid-1;
        else
        low  = mid+1;

            
            
            
            
            
        }
        return -1;
    }
}