class Solution {
    public int smallestNumber(int n) { 
        int x=1 ;         //2 pow 0 =1
        while(x-1 < n){  //esliye kyuki 2 pow k-1 is all set bit no.
            x=x*2;
        }
        return x-1;
        
    }
}