class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int maxVal = nums[0];
        int minVal = nums[0];
        
        for (int num : nums) {
            if (num > maxVal) maxVal = num;
            if (num < minVal) minVal = num;
        }
        
        int ans = (maxVal - minVal) - 2 * k;
        return Math.max(0, ans);
    }
}