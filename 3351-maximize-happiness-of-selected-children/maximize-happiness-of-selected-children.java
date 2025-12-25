class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        Arrays.sort(happiness);
        long ans = 0;
        for (int i = 0; i < k; i++) {
            int value = happiness[n - 1 - i] - i; // imp line..
            if (value > 0)
                ans += value;
        }
        return ans;

    }
}