public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        else if(target>nums[nums.length-1]){
            return nums.length;
        }
        else{
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
            if((i!=nums.length-1)&&nums[i]<target&&nums[i+1]>target){ //avoid array index overflow.
                return i+1;
            }
        }
        return 0; //no actual meaning, just to avoid complile error for missing return
        }
    }
}