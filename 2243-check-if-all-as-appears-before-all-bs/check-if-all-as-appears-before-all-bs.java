class Solution {
    public boolean checkString(String s) {
        for (int i = 1; i < s.length(); i++) {
            char prev = s.charAt(i - 1);
            char curr = s.charAt(i);
            
            if (prev == 'b' && curr == 'a') {
                return false;
            }
        }
        return true;
    }
}
