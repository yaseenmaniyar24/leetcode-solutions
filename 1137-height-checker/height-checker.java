class Solution {
    public int heightChecker(int[] heights) {
        Integer[] r= new Integer[heights.length];
        for(int i =0; i<heights.length;i++){
            r[i]=heights[i];
            
        }
        Arrays.sort(r);
        int c=0;
         for(int i =0; i<heights.length;i++){
        if ( r[i]!=heights[i]){
            c++;
        }

            
        }
        return c;

    }
}