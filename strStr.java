public class Solution {
    public int strStr(String haystack, String needle) {
         int n = haystack.length(), k = needle.length();
        if(n<k) return -1;
        if(k==0) return 0;
        for(int i=k-1;i<n;i++){
            int j = i, curr = k-1;
            while(haystack.charAt(j)==needle.charAt(curr)){
                j--;
                curr--;
                if(curr<0) break;
            }
            if(curr<0) return i-k+1;
        }
        return -1;
    }
}