class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drink= numBottles;
        int emptyBottles= numBottles;
        while(emptyBottles>=numExchange){
           emptyBottles = emptyBottles-numExchange ;
           drink++;
           emptyBottles++;
           numExchange++;
        }
        return drink;
        
    }
}