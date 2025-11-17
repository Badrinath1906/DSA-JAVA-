class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int countzero =k; // pass first 1
        for( int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(countzero<k)  return false;
                 else   countzero =0;// count ko reset kr diya..
                
            }
            else{
                countzero++;
            }
            
        }
        return true;
        
    }
}