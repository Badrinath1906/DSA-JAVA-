class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> ans = new ArrayList<>(map.keySet());

        ans.sort((a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b);
            }
            return map.get(b) - map.get(a);
        });

        return ans.subList(0, k);
    }
}