public class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0) return Integer.MAX_VALUE;
        //if(dividend==0) return 0;
        if(dividend==Integer.MIN_VALUE){
            if(divisor==-1) return Integer.MAX_VALUE;
            else if(divisor==1)  return dividend;
            else return ((divisor&1)==1)?divide(dividend+1,divisor):divide(dividend>>1,divisor>>1);
        } 
        if(divisor==Integer.MIN_VALUE) return 0;
        if(dividend<0&&divisor<0) return divide(-dividend,-divisor);
        if(dividend<0||divisor<0) return -divide(-dividend,divisor);
        int res = 0;
        while(dividend>=divisor){
            int tmp = divisor, tmpres = 1;
            while(dividend>=tmp<<1&&((tmp<<1))>divisor){ //avoid tmp overflow
                tmp <<= 1;
                tmpres <<= 1;
            }
            res += tmpres;
            dividend -= tmp;
        }
        return res;
    }
}