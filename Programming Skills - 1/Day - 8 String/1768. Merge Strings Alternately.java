//Brute Force Solution
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merge = "";
        int len = Math.min(word1.length(), word2.length());
        int i = 0;

        for( ; i < len; i++){
            merge = merge + word1.charAt(i) + word2.charAt(i);
        }
        while(i < word1.length()){
            merge += word1.charAt(i);
            i++;
        }
        while(i < word2.length()){
            merge += word2.charAt(i);
            i++;
        }
        return merge;
    }
}

//Optimize Solution
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = Math.min(word1.length(), word2.length());
        for (int i = 0; i <= length - 1; i++) {
            stringBuffer.append(word1.charAt(i));
            stringBuffer.append(word2.charAt(i));
        }
        if (length < word1.length()) {
            stringBuffer.append(word1.substring(length));
        }
        if (length < word2.length()) {
            stringBuffer.append(word2.substring(length));
        }
        return stringBuffer.toString();
    }
}
