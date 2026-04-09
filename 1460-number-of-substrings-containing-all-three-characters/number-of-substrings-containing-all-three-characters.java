class Solution {
    public int numberOfSubstrings(String s) {
        int LastA = -1;
        int LastB = -1;
        int LastC = -1;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                LastA = i;
            else if (s.charAt(i) == 'b')
                LastB = i;
            else
                LastC = i;
            int minIndex = Math.min(LastA, Math.min(LastB, LastC));
             result += (minIndex + 1);
        }
        return result;

    }
}