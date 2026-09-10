class Solution {
    public void moveZeroes(int[] nums) {
        int s=0;
          int   f=0;
        while(s<nums.length){
            if(nums[s]!=0){
                int temp = nums[s];
                nums[s]=nums[f];
                nums[f]=temp;
                 f++;
            }
            s++;
        }
    }
}