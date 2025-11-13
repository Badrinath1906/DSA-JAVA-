class Solution {
    public int maxProduct(int[] nums) {
        int n =nums.length;
         int prefix = 1;
         int suffix = 1;
          int maxproduct = nums[0];
          for( int i=0;i<n;i++){
            prefix*= nums[i];
            suffix*= nums[n-1-i];
            maxproduct = Math.max( maxproduct, Math.max(prefix,suffix));
            if(prefix==0) prefix =1;
            if(suffix == 0) suffix =1;
           
          }
        return maxproduct;
    }
}