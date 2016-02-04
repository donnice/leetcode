public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
    	Arrays.sort(candidates);
    	combinationSum2(candidates,0,target,new ArrayList<Integer>(),res);
    	return res;	
    }
    public void combinationSum2(int[] candidates, int pos, int target, List<Integer> curr, List<List<Integer>> res ){ 	
    	if(target==0){
    		res.add(new ArrayList<Integer>(curr));
    	}
    	else if(target<0||pos>=candidates.length) return;
    	else{
    		for(int i = pos;i<candidates.length&&candidates[i]<=target;i++){ //add && to avoid all nums already > target.
    			if(i!=pos&&candidates[i]==candidates[i-1]) continue; //similar to subsets, to avoid add duplicate
    			curr.add(candidates[i]);
        		combinationSum2(candidates,i+1,target-candidates[i],curr,res);
        		curr.remove(curr.size()-1);
    		}
    	}
    }
}