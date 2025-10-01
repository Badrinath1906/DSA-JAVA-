class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=1;//saare place pr 1 initalize kr do.
        }
        int prefix=1;// prefix multiply kro .
        for( int i=0;i<n;i++){
            ans[i]=prefix;
            prefix*=nums[i];// prefix update kro
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=suffix;
            suffix=suffix * nums[i];
        }
        return ans;
        
    }
}