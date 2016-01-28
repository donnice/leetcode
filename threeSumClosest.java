public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0, preDiff = Integer.MAX_VALUE, currDiff = 0, currSum = 0;
        for(int i=0;i<nums.length-2;i++){
        	int head = i+1, tail = nums.length-1;
        	while(head<tail){
        		currSum = nums[i]+nums[head]+nums[tail];
        		currDiff = Math.abs(currSum-target);
        		if(currDiff==0) return target;
        		else if(currDiff<preDiff){
        			preDiff = currDiff;
        			result = currSum;
        		}
        		if(currSum>target) tail--;
        		else head++;        		
        	}
        }
        return result;
    }
}