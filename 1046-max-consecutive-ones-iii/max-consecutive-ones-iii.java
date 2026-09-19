class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int z=0;
        int l=0;
        int r=0;
        int m=0;
        while(r<nums.length){
            if (nums[r]==0)z++;
            if (z>k){
                if(nums[l]==0){
                     z--;

                }
                l++;

            
            }
            if (z<=k){
               int  lm=r-l+1;
                m=Math.max(m,lm);

            }
            r++;


        }
        return m ;
    }
}