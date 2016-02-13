public class Solution {
    public int trap(int[] height) {
        int convexArea = 0, containerArea = 0, highest = 0;
        for(int i=0;i<height.length;i++) {
            containerArea += height[i];
            if(highest<height[i]) highest = height[i];
        }
        int l = 0, r = height.length-1, currHeight = 0;
        while(l<height.length&&height[l]<highest){
            if(height[l]>currHeight) currHeight = height[l];
            convexArea += currHeight;
            l++;
        }
        currHeight = 0;
        while(r>=0&&height[r]<highest){
            if(height[r]>currHeight) currHeight = height[r];
            convexArea += currHeight;
            r--;
        }
        convexArea += (r-l+1)*highest;
        return convexArea-containerArea;
    }
}
