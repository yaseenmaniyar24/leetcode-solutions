class Solution {
    public int trap(int[] height) {
        if(height==null|| height.length==0){
            return 0;
        }
            int l=0 ,r=height.length-1;
            int lm=0,rm=0;
            int t= 0;
            while(l<r){
                if(height[l]<height[r]){
                    if(height[l]>=lm){
                        lm=height[l];
                    }
                    else {
                        t+=lm-height[l];
                    }
                    l++;
                }
            
                else{
                    if(height[r]>=rm){
                        rm=height[r];

                    }
                    else {
                        t+=rm-height[r];
                    }
                    r--;
                }
            }
            return t;
        



        
    
    }
}