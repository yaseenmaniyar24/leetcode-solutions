class Solution {
    public int maxArea(int[] height) {
       int  m=0;
       int left=0;
       int right = height.length-1;
       while(left<right){
        int w=right-left;
        int ch=Math.min(height[left],height[right]);
        int cw = w*ch;
        m=Math.max(m,cw);
        if (height[left]<height[right]){
            left++;

        }
        else{
            right--;
        }
       } 
       return m;
    }
}