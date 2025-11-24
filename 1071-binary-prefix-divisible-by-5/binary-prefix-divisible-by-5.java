class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            int bit = nums[i];
            current = (current * 2 + bit) % 5;
            ans.add(current == 0);
        }
        return ans;
    }
}