class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '#'){
                Integer temp = (Integer.valueOf(s.substring(i-2,i)) + 96);
                ans.append(Character.toString(temp));
                i -= 2;
            }else{
                Integer temp=(Integer.valueOf(s.substring(i,i+1)) + 96);
                ans.append(Character.toString(temp));
            }
        }
        StringBuilder revans = ans.reverse();
        return revans.toString();
    }
}
