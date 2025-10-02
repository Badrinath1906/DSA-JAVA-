class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
        int digit=x%10;
         rev= rev*10+digit;
        x= x/10;
        }
        if(rev>2147483647||rev<-2147483647) return 0;
        return (int) rev;
    }
    
}