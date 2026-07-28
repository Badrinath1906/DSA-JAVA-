class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int cnt = 0;
        int prefSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            prefSum += nums[i];
            int rem = ((prefSum % k) + k) % k; //holds  negative value;
            if (map.containsKey(rem)) {
                cnt += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);

        }
        return cnt;

    }
}