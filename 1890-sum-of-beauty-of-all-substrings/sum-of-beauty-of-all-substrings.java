class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int val : map.values()) {
                    min = Math.min(val, min);
                    max = Math.max(val, max);
                }
                ans += max - min;

            }
        }
        return ans;

    }
}