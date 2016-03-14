public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) break; //target is 0 here, so if nums[i]>0, the successors must be positive, so reject.
            if(i!=0&&nums[i]==nums[i-1]) continue;
            int l = i+1, r = nums.length-1;
            while(l<r){
                if(l!=i+1&&nums[l]==nums[l-1]) {
                    l++;
                    continue;
                }
                if(r!=nums.length-1&&nums[r]==nums[r+1]){
                    r--;
                    continue;
                } 
                if(nums[l]+nums[r]<-nums[i]) l++;
                else if(nums[l]+nums[r]>-nums[i]) r--;
                else{
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    l++;
                    r--;
                }
            }
        }
        return res;//test
    }
}