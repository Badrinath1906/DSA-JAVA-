class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k =k%n;
        reverse(nums, 0,n-1);//full reverse
        reverse(nums,0,k-1);//first k reverse
        reverse(nums,k,n-1);//remaining reverse
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

}
