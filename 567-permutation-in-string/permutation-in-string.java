class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        int left = 0;
        int count = map.size();

        for (int right = 0; right < s2.length(); right++) {

            char ch = s2.charAt(right);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) count--;
            }

            if (right - left + 1 > s1.length()) {
                char l = s2.charAt(left++);
                if (map.containsKey(l)) {
                    if (map.get(l) == 0) count++;
                    map.put(l, map.get(l) + 1);
                }
            }

            if (count == 0)
                return true;
        }

        return false;
    }
}