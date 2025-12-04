class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1;
        while(i<=num/i){
            if(num/i==i && num%i==0) return true;
            i++;
        }
                
       return false; 
    }
}