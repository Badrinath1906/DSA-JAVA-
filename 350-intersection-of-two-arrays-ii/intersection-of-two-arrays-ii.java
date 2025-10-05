class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[]temp= new int[Math.min(nums1.length,nums2.length)];
        int size=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                        temp[size++]= nums1[i];
                        nums2[j]=  Integer.MIN_VALUE;// mark krne k liye ye use ho  chuka hai
                        break;//move to next no. in nums1[]
                }
            }
        }
 int res[]= new int[size];
 for( int i=0;i<size;i++){
    res[i]=temp[i];
 }
 return res;
        
    }
}