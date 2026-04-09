class Solution {
    public int dominantIndex(int[] nums) {
        int maxno = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxno) {
                maxno = nums[i];
                index = i;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (j == index)
                continue;
            if (maxno < 2 * nums[j])
                return -1;
        }
        return index;
    }
}