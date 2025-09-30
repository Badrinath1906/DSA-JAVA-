class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int[] ans= new int[n];
        int leftSum=0;
        for( int i=0;i<n;i++){
            int rightSum= total-leftSum-nums[i];
             ans[i] = Math.abs(leftSum-rightSum);
            leftSum+=nums[i];// left sum ko update krna padega
        } 
        return ans;
    }
}