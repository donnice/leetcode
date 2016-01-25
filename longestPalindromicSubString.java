public class Solution {
    public String longestPalindrome(String s) {
        int maxEven = 0;
        int maxOdd = 0;
        int keyEven = 0;
        int keyOdd = 0;
        String result = "";
        if(s.length() == 0)
            return "";
        if(s.length() == 1)
            return s;
        
        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
            	int newMaxEven = searchEvenString(s,i);
                if(maxEven<newMaxEven){
                    keyEven = i;   
                    maxEven = newMaxEven;
                }
            }    
            if(i > 0 && s.charAt(i+1)==s.charAt(i-1)){
            	int newMaxOdd = searchOddString(s,i);
            	if(maxOdd < newMaxOdd){
                    keyOdd = i;
                    maxOdd = newMaxOdd;
            	}
            }
        }
        
        if(maxEven>maxOdd){
        	System.out.print(maxOdd);
            int k = keyEven - maxEven/2+1;
            for(int i = 0; i<maxEven; i++){
                result = result + s.charAt(k);
                k++;
            }
            return result;
        }
        else{
        	System.out.println(maxOdd);
        	int k = keyOdd - maxOdd/2;
        	for(int i = 0; i<maxOdd; i++){
                result = result + s.charAt(k++);
            }
            return result;
        }
    }
    
    public static int searchEvenString(String s, int i){
        int maximum = 0;
        int forward = i+1;
        int backward = i;
        while(backward>=0 && forward<s.length()){
            if(s.charAt(forward)==s.charAt(backward)){
                maximum = maximum+2;
                forward++;
                backward--;
            }
            else
                break;
        }
        return maximum;
    }
    
    public static int searchOddString(String s, int i){
        int maximum = 1;
        int forward = i+1;
        int backward = i-1;
        while(backward>=0 && forward<s.length()){
            if(s.charAt(forward)==s.charAt(backward)){
                maximum = maximum+2;
                forward++;
                backward--;
            }
            else
                break;
        }
        return maximum;
    }
}