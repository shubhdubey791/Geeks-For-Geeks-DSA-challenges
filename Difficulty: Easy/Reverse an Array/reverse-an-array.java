class Solution {
    static void reverse (int[] a,int left,int right){
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
            
        }
        
        
        
    }
    public void reverseArray(int arr[]) {
        
        reverse(arr,0,arr.length-1);
        
    }
}