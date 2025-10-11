class Solution {
    public int captureForts(int[] forts) { 
         int  j=-0;
          int res=0;
         for(int i=0;i<forts.length;i++){
            if (forts[i]!=0){

                if(forts[j] == - forts[i]){ // opposite sign pr ruk jana hai
                    res= Math.max(res,i-j-1);
                }
                j=i;
            }
         }
        return res;
    }
}