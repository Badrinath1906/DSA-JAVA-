class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
             int prefSum = 0;
             int MaxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(0, -1);
            
            if (nums[i] == 1)
                prefSum--;
            else  prefSum++;
            
            if (map.containsKey(prefSum)) {
                MaxLen = Math.max(MaxLen, i - (map.get(prefSum)));
            } else
                map.put(prefSum, i);
        }
        return MaxLen;

    }
}