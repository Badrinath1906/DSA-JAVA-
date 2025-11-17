class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct =0;

        for( int i=0;i<nums.length-1;i++){
            for( int j =i+1;j<nums.length;j++){
            int product = 0;//reset as 0 
            product = (nums[i]-1) * (nums[j]-1);
            maxproduct = Math.max(maxproduct,product);
            }
        }
        return maxproduct;
        
    }
}