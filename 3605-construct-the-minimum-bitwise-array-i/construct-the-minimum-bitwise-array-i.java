class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int x = nums.get(i);

            // Even prime case
            if (x == 2) {
                ans[i] = -1;
                continue;
            }

            // Find first 0 bit from position 1 onward
            for (int bit = 1; bit < 31; bit++) {
                if (((x >> bit) & 1) == 0) {
                    ans[i] = x ^ (1 << (bit - 1));
                    break;
                }
            }
        }
        return ans;
    }
}
