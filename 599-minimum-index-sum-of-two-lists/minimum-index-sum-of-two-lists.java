class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            String num = list1[i];
            map1.put(num, map1.getOrDefault(num, i) + 1);
        }
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < list2.length; j++) {
            if (map1.containsKey(list2[j])) {
                int minsum = j + map1.get(list2[j]);
                min = Math.min(min, minsum);
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (map1.containsKey(list2[i]) && i + map1.get(list2[i]) == min) {
                ans.add(list2[i]);
            }
        }
        return ans.toArray(new String[0]);

    }
}