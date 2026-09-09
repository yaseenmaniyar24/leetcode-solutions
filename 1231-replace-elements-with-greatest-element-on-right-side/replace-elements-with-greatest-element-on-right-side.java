class Solution {
    public int[] replaceElements(int[] arr) {
       int m=-1;
       for (int i =arr.length-1;i>=0;i--){
        int temp=arr[i];
        arr[i]=m;
        m=Math.max(m,temp);
      
       } 
         return arr;
    }
}