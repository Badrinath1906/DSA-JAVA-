class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
            if (count == n) {
                ans = nums[i];
                break;
            }
        }
        return ans;

    }
}