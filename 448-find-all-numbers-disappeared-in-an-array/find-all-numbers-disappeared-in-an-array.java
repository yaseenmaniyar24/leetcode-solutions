class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Mark present numbers by negating values at index (val - 1)
        for (int i = 0; i < nums.length; i++) {
            int c = Math.abs(nums[i]);
            int idx = c - 1;
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }
        
        List<Integer> res = new ArrayList<>();
        
        // Positive value at index i means (i + 1) was missing
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        
        return res;
    }
}