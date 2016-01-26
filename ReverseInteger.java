public class Solution {
    public int reverse(int x) {
        int sign = (x>=0)?1:-1;
        long y = (long)x;
        long res = 0;
        while(y!=0){
            res = res*10+y%10;
            y /= 10;
        }
        if(res == (long)Integer.MAX_VALUE+(long)1)
            return (sign == -1)? Integer.MIN_VALUE:0;
        else if(res > (long)Integer.MAX_VALUE)
            return 0;
        else
            return (int)res;
    }
}