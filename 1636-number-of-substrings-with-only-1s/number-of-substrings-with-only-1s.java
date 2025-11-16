class Solution {
    public int numSub(String s) {
        long ans =0;
        long left =0;  // window starting point
         long mod =1000000007;

         for( int right=0; right<s.length();right++){
            if(s.charAt(right)=='1')
            ans=(ans+(right-left+1))%mod;  // window size
            else     left = right+1;       //reset window
         }
         return (int)ans;
        
    }
}