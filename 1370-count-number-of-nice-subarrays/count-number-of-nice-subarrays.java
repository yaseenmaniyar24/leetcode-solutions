class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        return at(nums,k)-at(nums,k-1);
    }
    private int at(int[] nums,int k){
        if (k<0) return 0;
        int l=0 , c=0, o=0 , r=0;

        for (r=0; r<nums.length; r++){
            if (nums[r]%2!=0) o++;
            while(o>k){
                if (nums[l]%2!=0) o--;
              
            l++;     
            }
            c+=(r-l+1);

        }
        return c ;
    }
    
}