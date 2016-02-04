public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        combinationSum(candidates,0,target,0,new ArrayList<Integer>(),result);
        return result;          
    }
    
    public void combinationSum(int[] source, int start, int n, int currSum, List<Integer> curr, List<List<Integer>> result){
        if(currSum>n) return;
        else if(currSum==n){
            List<Integer> list = new ArrayList<Integer>(curr);
            result.add(list);
        }
        else if(start>source.length-1) return; //avoid array index over flow and terminate loop; should put it after checking currSum==n
                                               //otherwise the last element will never be used
        else{
            List<Integer> list = new ArrayList<Integer>(curr);
            for(int i = 0;i<=n/source[start];i++){ // <=, first don't add start element and then add one by one
                combinationSum(source,start+1,n,currSum,list,result);
                list.add(source[start]);
                currSum += source[start];
            }
        }
    }
}