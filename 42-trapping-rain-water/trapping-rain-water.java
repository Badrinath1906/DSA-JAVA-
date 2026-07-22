class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;
        while (l < r) {
            if (height[l] > leftMax) {
                leftMax = Math.max(leftMax, height[l]);
            }
            if (height[r] > rightMax) {
                rightMax = Math.max(rightMax, height[r]);
            }
            if (leftMax < rightMax) {
                ans += leftMax - height[l];
                l++;
            } else {
                ans += rightMax - height[r];
                r--;
            }
        }
        return ans;
    }
}