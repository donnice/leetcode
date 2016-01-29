public class Solution {
    List<String> resultList = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        
        generateParenhesis("",n,n);
        return resultList;
    }
    public void generateParenhesis(String s, int left, int right){
    	if(left==0&&right==0) resultList.add(s);
    	else if(left>0){
    		generateParenhesis(s+"(", left-1,right);   		
    	}
    	if(left<right) generateParenhesis(s+")",left,right-1);
    }
}