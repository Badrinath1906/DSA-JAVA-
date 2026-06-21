class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;
        for (int cost : costs) {
            maxCost = Math.max(cost, maxCost);
        }
        int[] freq = new int[maxCost + 1];
        for (int cost : costs) {
            freq[cost]++;
        }
        int count = 0;
        for (int i = 1; i <= maxCost; i++) {
            while (freq[i] > 0 && coins >= i) {
                coins -= i;
                freq[i]--;
                count++;
            }
            if (coins < i)
                break;
        }
        
        return count;

    }
}