class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void solve(int index, int[] nums, List<Integer> curr, List<List<Integer>> ans) {
        // base case....
        if (index == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        //  Include nums[index]...
        curr.add(nums[index]);
        solve(index + 1, nums, curr, ans);

        // backtrack kro aur fill kro..
        curr.remove(curr.size() - 1);

        //  Exclude nums[index]
        solve(index + 1, nums, curr, ans);
    }
}
