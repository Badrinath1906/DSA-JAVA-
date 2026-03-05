class Solution {
    public int minOperations(String s) {
        int op1 = 0; 
        int op2 = 0;

        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                if(s.charAt(i) != '0') op1++;
                if(s.charAt(i) != '1') op2++;
            }
            else{
                if(s.charAt(i) != '1') op1++;
                if(s.charAt(i) != '0') op2++;
            }
        }

        return Math.min(op1, op2);
    }
}