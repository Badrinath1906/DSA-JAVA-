class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        for (int a : map.keySet()) {
            if (map.containsKey(a + 1)) {
                max = Math.max(max, map.get(a) + map.get(a + 1));

            }
        }

        return max;

    }
}