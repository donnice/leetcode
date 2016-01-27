public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int area = 0;
        while(left<right){
            if(height[left]<height[right]){
                area = Math.max(height[left]*(right-left),area);
                left++;
            }
            else{
                 area = Math.max(height[right]*(right-left),area);
                right--;
            }
        }
        return area;
            
    }
}