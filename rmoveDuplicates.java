public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length == 0 || length == 1)
            return length;
        for(int i = 1; i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                length--;
            }
        }
        int index = 1;
        int origin = index;
        for(int i = 1; i<length; i++){
            if(nums[index] == nums[index - 1]){
                while(nums[index] == nums[index - 1]){
                   index++;
                }
            }
            nums[i] = nums[index];
            index++;
        }
        return length;
    }
}