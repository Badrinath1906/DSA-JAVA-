class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApple = 0;
        for (int a : apple) {
            totalApple += a;
        }
        Arrays.sort(capacity);
        int Usedbox = 0;
        int box = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            Usedbox += capacity[i];
            box++;
            if (Usedbox >= totalApple)
                return box;
        }
        return box;
    }
}