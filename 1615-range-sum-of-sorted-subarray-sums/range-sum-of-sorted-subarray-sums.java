class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int prefixSum = 0;
            for (int j = i; j < nums.length; j++) {
                prefixSum += nums[j];
                list.add(prefixSum);
            }
        }

        Collections.sort(list);
        long sum = 0;
        long mod = 1_000_000_007;
        int i = left - 1;
        while (i < right) {
           sum = (sum+ list.get(i)) % mod;
            i++;
        }
        return (int) sum;
    }
}