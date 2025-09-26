class Solution {
    public boolean search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private boolean binarySearch(int[] nums, int target, int left, int right) {
        if (left > right) return false;  // base case

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) return true;

        if(nums[left]== nums[mid] && nums[mid]==nums[right])//check duplicate
        return binarySearch(nums, target, left+1, right-1);

        // Check if left half is sorted
        if (nums[left] <= nums[mid]) {
            if (target >= nums[left] && target < nums[mid]) {
                return binarySearch(nums, target, left, mid - 1);
            } else {
                return binarySearch(nums, target, mid + 1, right);
            }
        }
        // Otherwise, right half is sorted
        else {
            if (target > nums[mid] && target <= nums[right]) {
                return binarySearch(nums, target, mid + 1, right);
            } else {
                return binarySearch(nums, target, left, mid - 1);
            }
        }
    }
}
