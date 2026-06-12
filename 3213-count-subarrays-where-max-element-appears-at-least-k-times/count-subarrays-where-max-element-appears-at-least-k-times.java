class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max,nums[i]);
        }
        long ans = 0;
        int left = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == max)
                count++;
            while (count == k) {
                if (nums[left] == max)
                    count--;
                left++;
            }
            ans += left;
        }
        return ans;

    }
}