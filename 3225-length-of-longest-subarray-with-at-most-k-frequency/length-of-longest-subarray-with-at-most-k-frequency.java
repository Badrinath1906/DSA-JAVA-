class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            map.put(num, map.getOrDefault(num, 0) + 1);
            
            while (map.get(num) > k) {
                int leftNum = nums[left];
                map.put(leftNum, map.get(leftNum) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }
}