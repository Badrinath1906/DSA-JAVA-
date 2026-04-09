class Solution {
    public int numberOfSubstrings(String s) {
        int[] last = {-1, -1, -1}; // a → 0, b → 1, c → 2
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
            
            int minIndex = Math.min(last[0], Math.min(last[1], last[2]));
            ans += minIndex + 1;
        }

        return ans;
    }
}