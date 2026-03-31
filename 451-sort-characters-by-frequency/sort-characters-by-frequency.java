class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int maxFreq = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) > maxFreq) {
                maxFreq = map.get(ch);
            }
        }
        while (maxFreq > 0) {
            for (char key : map.keySet()) {
                if (map.get(key) == maxFreq) {
                    for (int i = 0; i < maxFreq; i++) {
                        sb.append(key);
                    }
                }

            }
            maxFreq--;

        }

        return sb.toString();

    }
}