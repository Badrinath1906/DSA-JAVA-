class Solution {
    public int maxProduct(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int firstIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                firstMax = nums[i];
                firstIdx = i;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= firstMax && i != firstIdx) {
                secMax = Math.max(nums[i], secMax);

            }

        }
        return ((firstMax - 1) * (secMax - 1));

    }
}