class Solution {
    public int thirdMax(int[] nums) {
        long firstmax = Long.MIN_VALUE;
        long  secondmax= Long.MIN_VALUE;
        long thirdmax=  Long.MIN_VALUE;
        for(int num:nums){
            if(num>firstmax){
                thirdmax= secondmax;
                secondmax= firstmax;
                firstmax= num;
            }
            else if(num>secondmax &&  num!=firstmax){
                thirdmax= secondmax;
                secondmax= num;
            }
            else if(num>thirdmax && num!=firstmax &&num!=secondmax){
                thirdmax= num;
            }
        }
        return thirdmax== Long.MIN_VALUE ?(int)firstmax:(int)thirdmax;
        
    }
}