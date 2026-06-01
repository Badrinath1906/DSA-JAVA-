class Solution {
    public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int rem = ((num % k) + k) % k; // handle negatives
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        for (int rem : map.keySet()) {
            int count = map.get(rem);

            if (rem == 0) {
                if (count % 2 != 0) return false;
            } 
            else if (2 * rem == k) { // k even and rem = k/2
                if (count % 2 != 0) return false;
            } 
            else {
                if (count != map.getOrDefault(k - rem, 0))
                    return false;
            }
        }

        return true;
    }
}