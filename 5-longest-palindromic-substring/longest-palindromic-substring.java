class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            String len1 = expand(s, i, i);
            String len2 = expand(s, i, i + 1);
            if (len1.length() > ans.length())  ans = len1; 
            if (len2.length() > ans.length())  ans = len2;    
        }
        return ans;
    }
    String expand(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}