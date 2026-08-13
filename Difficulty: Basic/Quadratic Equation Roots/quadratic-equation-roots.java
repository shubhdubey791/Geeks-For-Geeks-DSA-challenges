class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> arr = new ArrayList<>();
       int d= b*b - 4*a*c;
       if(d<0){
           arr.add(-1);
           return arr;
       }
       else{
           int x= (int)Math.floor((-b + Math.sqrt(d))/(2*a));
           
           int y=(int)Math.floor((-b - Math.sqrt(d))/(2*a));
           
           arr.add(Math.max(x,y));
           arr.add(Math.min(x,y));
           return arr;
       }
       
       
       
       
    }
}