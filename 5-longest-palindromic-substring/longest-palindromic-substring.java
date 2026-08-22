class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            String oddStr = expand(s, i, i);
            String evenStr = expand(s, i, i + 1);
            
            if (oddStr.length() > ans.length()) {
                ans = oddStr;
            }
            if (evenStr.length() > ans.length()) {
                ans = evenStr;
            }
        }
        return ans;
    }
    
    public String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}