class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] res=new int[nums.length];
        int l =0;
        int r =nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[l]=nums[i];
                l++;
            }
             if(nums[i]%2!=0){
                res[r]=nums[i];
                   r--;
             }
        }
        return res;
          
    }
}