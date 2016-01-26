public class Solution {
    public int myAtoi(String str) {
        long res = 0;
        int sign = 1;
        boolean numFound = false;
        boolean signFound = false;
        
        for(int i = 0; i<str.length(); i++){
            if(numFound){
                if(Character.isDigit(str.charAt(i))){
                    res = res*10+(str.charAt(i)-48);
                    if(res>Integer.MAX_VALUE)
                        return (sign>0)?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                else
                    return (int)res*sign;
            }
            else if(!signFound){
                if(Character.isDigit(str.charAt(i))){
                    res = res*10+(str.charAt(i)-48);
                    if(res>Integer.MAX_VALUE)
                        return (sign>0)?Integer.MAX_VALUE:Integer.MIN_VALUE;
                    numFound = true;
                }
                else if(str.charAt(i) == '+' || str.charAt(i) == '-'){
                    if(str.charAt(i) == '-')
                        sign = -1;
                    signFound = true;
                }
                else if(str.charAt(i)!=' ')
                    return 0;
            }
            else{
                if(Character.isDigit(str.charAt(i))){
                    res = res*10+(str.charAt(i)-48);
                    if(res>Integer.MAX_VALUE)
                        return (sign>0)?Integer.MAX_VALUE:Integer.MIN_VALUE;
                    numFound = true;
                }
                else
                    return 0;
            }
        }
        return res == 0? 0:(int)res*sign;
    }
}