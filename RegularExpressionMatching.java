public class Solution {
    public boolean isMatch(String s, String p) {
        return matching(s,0,p,0);   
    }
    
    public boolean matching(String s, int beginS, String p, int beginP){
        if(beginP==p.length()) return beginS==s.length();
        else if(beginS==s.length()){ //s is already matched, check whether remaining p could be null string;
            int checkSum = 0;
            for(int i = beginP;i<p.length();i++){
                if(p.charAt(i)=='*') checkSum--;
                else checkSum++;
            }
            return checkSum==0;
        }
        else{ //normal case, do the matching.
            if(beginP!=p.length()-1 && p.charAt(beginP+1)=='*'){
                int index = beginS-1;
                while(index<s.length()&&(index==beginS-1||p.charAt(beginP)=='.'||p.charAt(beginP)==s.charAt(index))){
                    if(matching(s,++index,p,beginP+2)) return true;
                }
            }
            else if(p.charAt(beginP)=='.'||p.charAt(beginP)==s.charAt(beginS)) { //beginP is at a single char.
                return matching(s,beginS+1,p,beginP+1); 
            }
            return false;
        }
    }
}