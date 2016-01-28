public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits.length()==0) return res;
        StringBuilder str = new StringBuilder();
        String[] dic = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        letterCombination(dic,digits,0,str,res);
        return res;
    }
    public void letterCombination(String[] dic, String digits, int pos, StringBuilder str, List<String> res){
        if(str.length()==digits.length()){
            String combination = str.toString();
            res.add(combination);
            return;
        }
        else{           
            //int dicIndex = (int) digits.charAt(pos)-48-1; //char '0' is 48. or use parseInt.
            int dicIndex = Integer.parseInt(digits.substring(pos, pos+1))-1;
            for(int i=0;i<dic[dicIndex].length();i++){
                str.append(dic[dicIndex].charAt(i));
                letterCombination(dic,digits,pos+1,str,res);
                str.deleteCharAt(str.length()-1);
            }
        }
    }
}