class Solution {
    public int findFinalValue(int[] nums, int original) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] == original) {
                int mul = 2 * original;
                original = mul;
                i=0;
            }
        }
        return original;

    }
}