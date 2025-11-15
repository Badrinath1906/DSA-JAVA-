class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count =0;
        for( int i=0; i<n;i++){
            for( int j=i+1;j<=n;j++){
                String sub= s.substring(i,j);
                if(isPalindrome(sub))  //to count substring..
                count++;
            }
        }
        return count;
    }
        public static boolean isPalindrome(String str){
        int i=0, j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!= str.charAt(j))
                return false;;
                i++;
                j--;
        }
            
      return true;  
    }
}