public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>(); 
    Set store=new HashSet(); 
    for(int i=0;i<nums.length;i++) store.add(nums[i]);
    List<Integer> temp=new ArrayList<Integer>();
    re(store,temp,result);
    return result;
}
public static void re(Set<Integer> s,List<Integer> t,List<List<Integer>> result){
    if(s.size()==1){
        for (Iterator<Integer> it = s.iterator(); it.hasNext();) {
            int m = it.next();
            t.add(m);
            List<Integer> x=new ArrayList<Integer>(t);
            result.add(x);
            t.remove(t.size()-1);
        }

        return;
    }
    Iterator<Integer> iter = s.iterator();
    while (iter.hasNext()) {
        int y=iter.next();
        t.add(y);
        Set<Integer> s_n=new HashSet<Integer>(s);
        s_n.remove(y);
        re(s_n,t,result);
        t.remove(t.size()-1);
    }
    }
}//te