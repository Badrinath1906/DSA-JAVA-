class Solution {
    public int missingInteger(int[] nums) {
        int prefSum =nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                prefSum+=nums[i];
            }
            else break;
        }
        HashSet<Integer>set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int x =prefSum;
        while(set.contains(x)) x++;  

        return x;
    }
}