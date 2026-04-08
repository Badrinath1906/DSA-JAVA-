class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int maxPairSum = 0;
        while (i < nums.length && j >= 0) {
            int sum = nums[i] + nums[j];
            maxPairSum = Math.max(maxPairSum, sum);
            i++;
            j--;
        }
        return maxPairSum;

    }
}