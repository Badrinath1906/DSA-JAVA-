class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int totalSum = 0;
        
        for (int pile : piles) {
            pq.add(pile);
            totalSum += pile;
        }
        
        for (int i = 0; i < k; i++) {
            int maxPile = pq.poll();
            int remove = maxPile / 2;
            totalSum -= remove;
            pq.add(maxPile - remove);
        }
        
        return totalSum;
    }
}