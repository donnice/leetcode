public class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int n = nums.length;
        while(i<n) {
            if(nums[i]!=i+1 && nums[i]>0 && nums[i]<=n && nums[i]!=nums[nums[i]-1]){
                int tmp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = tmp;
                //swap(A[i],A[A[i]-1]);
            }
            else
                i++;
        }
        for(int j=0; j<n; j++) {
            if(nums[j]!=j+1) return j+1;
        }
        return n+1;
    }
}