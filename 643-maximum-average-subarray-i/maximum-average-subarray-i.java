class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currSum);
                currSum -= nums[left];
                left++;
            }
        }
        return (double) maxSum / k;
    }

}