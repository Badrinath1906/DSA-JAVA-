class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                count++;
                if (count == k)
                    return key;
            }

        }
        return "";

    }
}