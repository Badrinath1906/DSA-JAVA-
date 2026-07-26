class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOne = 0;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum + k < right - left + 1) {
                sum -= nums[left];
                left++;
            }
            maxOne = Math.max(maxOne, right - left + 1);

        }
        return maxOne;
    }
}