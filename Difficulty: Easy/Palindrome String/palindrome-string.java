class Solution {
    boolean isPalindrome(String s) {
    int n = s.length();
    int low = 0;
    int high = n-1;
    while(low<=high){
        
        
        if(s.charAt(low)!=s.charAt(high))
        return false;
        else 
        low++;
        high--;
    }
        return true;
    }
}