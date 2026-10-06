class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length-1;

        while( lp < rp ){
                // calculate water area
                int ht = Math.min(height[lp], height[rp]);
                int width =rp - lp;
                int currWater = ht * width;

                maxWater = Math.max(maxWater, currWater);

                // update ptr
                if(height[lp] < height[rp]){
                    lp++;
                }else{
                    rp--;
                }
            }
            return maxWater;
        }
}

