public class Solution {
    public String countAndSay(int n) {
         StringBuilder strbd = new StringBuilder();
        String str = "1";
        for(int i = 1;i<n;i++){
            int count = 0;
            for(int j = 0;j<str.length();j++){
                if(j+1!=str.length()&&str.charAt(j+1)==str.charAt(j)){
                    count++;
                }
                else{
                    strbd.append(++count);
                    strbd.append(str.charAt(j));
                    count = 0;
                }
            }
            str = strbd.toString();
            strbd.delete(0,strbd.length());
        }
        return str;
    }
}