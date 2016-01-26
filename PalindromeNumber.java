public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int digits = 0, digitCounter = 1;
        for(int i = 1;i<11;i++){
            if(x/digitCounter!=0) digits = i;
            digitCounter *=10;
        }
        if(digits == 0 || digits == 1) return true;
        else{
            int mid = (digits%2==0)?(digits/2):(digits/2+1);
            int y = x;
            digitCounter = (int)Math.pow(10,digits-1);
            for(int i=1;i<=mid;i++){
                if(y%10!=x/digitCounter) return false;
                y /= 10;
                x %= digitCounter;
                digitCounter /=10;
            }
            return true;
        }   
    }
}