class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (char ch :s.toCharArray() ) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        boolean hasOdd = false;
        for (int freq : map.values()) {
            if (freq % 2 == 0)
                count += freq;
            else {
                count += (freq - 1);
                hasOdd = true;
            }
        }
        return hasOdd ? count + 1 : count;
    }
}