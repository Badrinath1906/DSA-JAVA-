class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int n = nums.length;
        int prefSum =0;
            for(int i=0;i<n;i++){
                prefSum +=nums[i];
                if(map.containsKey(prefSum-goal)){
                    count += map.get(prefSum -goal);
                }
                map.put(prefSum, map.getOrDefault(prefSum,0)+1);

            }
        return count;
        
    }
}