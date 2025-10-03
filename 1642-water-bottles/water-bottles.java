class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=numBottles;
        while(numBottles>=numExchange){
            int exchange=numBottles/numExchange;// bhari hui bottles
            int extraEmpty= numBottles%numExchange;//khali bottles
            drink += exchange;// bhari hui bottles ko drink kr lo jo exchange me mili
             numBottles=exchange+extraEmpty;
          }
          return drink;
        
    }
}