public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        while(pos<strs[0].length()){
            for(int i = 1; i<strs.length; i++){
                if(pos>=strs[i].length() ||strs[0].charAt(pos)!=strs[i].charAt(pos) )
                    return sb.toString();
            }
            sb.append(strs[0].charAt(pos));
            pos++;
        }
        return sb.toString();
    }
}