class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int maxLen =0;
        map.put(0,-1);
        int prefSum =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)  prefSum += -1;
            else  prefSum += 1;

            if(map.containsKey(prefSum))
            maxLen = Math.max(maxLen ,i-map.get(prefSum));
            else map.put(prefSum, i);
        }
        return maxLen;
        
    }
}