class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;           // no valid split when array has < 2 elements..

        long total = 0;
        for (int x : nums) total += x;

        return (total & 1) == 1 ? 0 : n - 1;
    }
}
