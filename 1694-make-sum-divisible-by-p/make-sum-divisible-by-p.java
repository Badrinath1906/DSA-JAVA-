class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int rem =(int)(sum % p);
        if (rem == 0)
            return 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        long prefix = 0;
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i]) % p;
            int target = ((int)(prefix - rem + p) % p);
            if (mp.containsKey(target)) {
                ans = Math.min(ans, i - mp.get(target));
            }
            mp.put((int)prefix, i);
        }
        return ans == nums.length ? -1 : ans;

    }
}