import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null)
            return 0;
        char[] c = s.toCharArray();
        int leftBound = 0;
        int length = 0;
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0; i<c.length; i++){
            if(set.contains(c[i])){
                while(leftBound<i && c[leftBound]!=c[i]){
                    set.remove(c[leftBound]);
                    leftBound++;
                }
                leftBound++;
            }
            else{
                set.add(c[i]);
                length = Math.max(length, i-leftBound+1);
            }
        }
        return length;
    }
}