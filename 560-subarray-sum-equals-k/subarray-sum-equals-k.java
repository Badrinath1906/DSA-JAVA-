class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefSum = 0;
        int count = 0;
        map.put(0, 1);

        for (int num : nums) {
            prefSum += num;
            if (map.containsKey(prefSum - k)) {
                count += map.get(prefSum - k);
            }
            map.put(prefSum, map.getOrDefault(prefSum, 0) + 1);
        }
        return count;

    }
}