class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();//convert into  character array
        int n = a.length;

        for (int i= 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                char t = a[left];
                a[left] = a[right];
                a[right] = t;
                left++;
                right--;
            }
        }

        return new String(a);
    }
}
