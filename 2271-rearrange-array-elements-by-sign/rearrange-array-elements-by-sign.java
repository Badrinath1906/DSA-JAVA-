class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int k = 0, j = 0;
        int[] postive = new int[n / 2];
        int[] negative = new int[n / 2];
        for(int i = 0; i < n; i++) {
            if (nums[i] > 0)
                postive[k++] = nums[i];
            else
                negative[j++] = nums[i];
        }
         k=0;
         j=0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                nums[i] = postive[k++];
            else
                nums[i] = negative[j++];
        }
        return nums;

    }
}