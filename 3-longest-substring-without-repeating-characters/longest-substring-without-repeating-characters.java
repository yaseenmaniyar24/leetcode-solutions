class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[]l = new int [255];
        Arrays.fill(l,-1);
        int m=0;
        int left=0;
        for (int right=0;right<s.length();right++){
            char c= s.charAt(right);
            if (l[c]>=left){
                left=l[c]+1;

            }
            l[c]=right;
            m=Math.max(m,right-left+1);
        }
        return m;
    }
}