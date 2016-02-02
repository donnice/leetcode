public class Solution {
    public int search(int[] nums, int target) {
        int a = 0, b = nums.length-1;
        while(a<=b){  // use a<=b in case ony 1 element in nums. with line 8 we will never have the case a = b later.
            int half = (a+b)/2;
            if(nums[half]==target) return half;
            else if(half==a){
                if(nums[b]==target) return b;
                else return -1;
            }
            else if(nums[half]>nums[a]){
                if(target>=nums[a]&&target<nums[half]) b = half-1;
                else a= half +1;
            }
            else{
                if(target>nums[half]&&target<=nums[b]) a = half +1;
                else b = half -1;
            }
        }
        return -1;
    }
}