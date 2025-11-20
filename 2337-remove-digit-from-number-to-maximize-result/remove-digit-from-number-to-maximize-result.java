class Solution {
    public String removeDigit(String number, char digit) {
        StringBuilder sb =new StringBuilder(number);
         int idx=-1;
           for( int i=0;i<number.length();i++) {
              if(number.charAt(i)== digit) {
                 idx=i;

                if(i+1<number.length() && number.charAt(i)<number.charAt(i+1) ){//aage wala digit agr bada hoga to us index wle no .ko delete kr do..
                    break;
           }
              }
           }
          
           sb.deleteCharAt(idx);
           return sb.toString();
    }
}
        
        