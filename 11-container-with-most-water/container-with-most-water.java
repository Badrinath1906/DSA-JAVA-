class Solution {
    public int maxArea(int[] h) {
        int n= h.length;
        return area(h, 0, n-1 );
    }

    int area(int[] h, int left, int right) {
        if (left >= right) return 0; // base case hai
        int curr = (right - left) * Math.min(h[left], h[right]); // ye width*length =area

        if (h[left] < h[right])
            return Math.max(curr, area(h, left + 1, right)); // recursively call
        else
            return Math.max(curr, area(h, left, right - 1));
    }
}
