class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        return at(nums,k)-at(nums,k-1);
    }
    private  int at (int []nums, int k){
        int l=0, r=0, c=0,d=0;
        int[] f= new int [nums.length+1];
        for ( r=0;r<nums.length;r++){
            if(f[nums[r]]==0){
                d++;
            }
            f[nums[r]]++;
             while(d>k){
                f[nums[l]]--;
                if(f[nums[l]]==0) d--;
                l++;

             }
             c+=r-l+1;
        
        }
        return c ;


    }
}