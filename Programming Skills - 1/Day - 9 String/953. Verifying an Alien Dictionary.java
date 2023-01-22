class Solution {
    
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < words.length - 1; i++) {
            if (!isSorted(words[i], words[i + 1], order)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isSorted(String word1, String word2, String order) {
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            if (order.indexOf(word1.charAt(i)) > order.indexOf(word2.charAt(i))) {
                return false;
            } else if (order.indexOf(word1.charAt(i)) < order.indexOf(word2.charAt(i))) {
                return true;
            }
        }
        return word1.length() <= word2.length();
    }
}
