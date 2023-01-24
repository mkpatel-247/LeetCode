class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        s = sorting(s);
        t = sorting(t);
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(t.charAt(i) != s.charAt(i)){
                // if(cnt >= 1 && s.length() <= cnt){
                //     return true;
                // }
                return false;
            }   
            cnt++;
        }
        return true;
    }

    private String sorting(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        // System.out.println(String.valueOf(arr));
        return String.valueOf(arr);
    }
}
