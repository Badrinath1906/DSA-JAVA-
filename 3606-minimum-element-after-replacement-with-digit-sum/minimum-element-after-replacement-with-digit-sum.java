class Solution {
    public int minElement(int[] nums) {
        int[] res = new int[nums.length];
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            n = nums[i];
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            res[i] = sum;

        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < res.length; i++) {
            min = Math.min(min, res[i]);

        }
        return min;

    }
}