class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : answers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int total = 0;
        for (int x : map.keySet()) {
            int freq = map.get(x);
            int groupSize = x + 1;
            int group = (freq + groupSize - 1) / groupSize;
            total += group * groupSize;
        }
        return total;

    }
}