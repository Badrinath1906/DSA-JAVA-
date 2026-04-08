class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        if (nums.length < 2)
            return nums.length;
        for (int num : nums) {
            if (k < 2 || num != nums[k - 2])
                nums[k++] = num;
        }
        return k;
    }
}