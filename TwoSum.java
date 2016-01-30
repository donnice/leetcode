public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] origin = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
            origin[i] = nums[i];
        Arrays.sort(nums);
        int start = 0;
        int a = 0;
        int b = 0;
        int end = nums.length-1;
        while(start<end){
            if(nums[start] + nums[end] == target){
                for(int i = 0; i<nums.length; i++){
                    if(origin[i] == nums[start]){
                        start = i;
                        break;
                    }
                }
                
                for(int i = nums.length -1; i>=0; i--){
                    if(origin[i] == nums[end]){
                        end = i;
                        break;
                    }
                }
                if(start>end){
                    int temp = start;
                    start = end;
                    end = temp;
                }
                int[] result = {start+1, end+1};
                return result;
            }
            
            else if(nums[start] + nums[end] < target){
                start++;
            }
            else{
                end--;
            }
        }
        return null;
    }
}//test edit