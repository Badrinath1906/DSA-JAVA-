class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;
        if (nums.length == 0)
            return 0;

        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currnum = num;
                int length = 1;

                while (set.contains(currnum + 1)) {
                    currnum++;
                    length++;

                }
                maxLen = Math.max(maxLen, length);
            }

        }

     return maxLen;

    }
}