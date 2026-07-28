class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int n = nums.length;
            for(int i=0;i<n;i++){
                int Prefsum = 0;
                for(int j=i;j<n;j++){
                    Prefsum += nums[j];
                    if(Prefsum == goal)
                        count++;
                }
            }
        return count;
        
    }
}