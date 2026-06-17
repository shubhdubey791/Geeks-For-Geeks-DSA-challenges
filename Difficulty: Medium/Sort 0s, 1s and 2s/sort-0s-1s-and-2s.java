class Solution {
    public void sort012(int[] arr) {
         int count0 =0;
          int count1 =0;
          int count2 =0;
        for (int i = 0 ;i <arr.length; i++){
            if (arr[i]==0)
            count0++;
            else if (arr[i]==1)
            count1++;
            else if (arr[i]==2)
            count2++;
        }
        count1+=count0;
        count2+=count1;
for (int i = 0 ;i <arr.length; i++){
    if(i<count0)
    arr[i]= 0;
   else if( i< count1)
    arr[i] = 1;
    else 
    arr[i]= 2;
       }
    }
}