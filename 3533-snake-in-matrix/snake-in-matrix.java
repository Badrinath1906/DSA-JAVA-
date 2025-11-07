class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int rows=0;
        int cols= 0;
        for(String cmd:commands){
            switch(cmd){
                case "UP":
                rows--;
                break;

                case "DOWN":
                rows++;
                break;

                case "LEFT":
                cols --;
                break;

                case "RIGHT":
                cols++;
                break;

            }
        }
        return rows*n + cols;
        
    }
}