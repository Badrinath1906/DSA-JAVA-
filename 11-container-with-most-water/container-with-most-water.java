class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = Integer.MIN_VALUE;
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, minHeight * width);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;

    }
}