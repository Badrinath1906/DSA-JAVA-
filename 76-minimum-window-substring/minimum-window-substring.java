class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        int count = map.size();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            //Expansion phase
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0)   count--;
                    
            }
            //Shrinking phase
            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char leftch = s.charAt(left);
                if (map.containsKey(leftch)) {
                    if (map.get(leftch) == 0)    count++;   
                    map.put(leftch, map.get(leftch) + 1);
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);

    }
}