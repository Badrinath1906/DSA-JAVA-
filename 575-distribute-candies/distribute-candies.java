class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : candyType) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int unique = map.size();
        int maxlen = candyType.length / 2;
        int min = Math.min(unique, maxlen);
        return min;

    }
}