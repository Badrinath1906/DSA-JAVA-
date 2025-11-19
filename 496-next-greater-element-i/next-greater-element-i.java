class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int n= nums2.length;
         int []nge = new int[n];
         Stack<Integer>st= new Stack<>(); 
         st.push(n-1);
         nge[n-1]= -1;
         for( int i=n-2;i>=0;i--){
         while(st.size()>0 && nums2[i]>nums2[st.peek()]){
            st.pop();
         }
         if(st.size()==0) nge[i]=-1;
         else  nge[i]= nums2[st.peek()];
         st.push(i);
         }
         int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];

            // Find index of target in nums2
            int idx = -1;
            for (int j = 0; j < n; j++) {
                if (nums2[j] == target) {
                    idx = j;
                    break;
                }
            }

            // Now assign its NGE
            ans[i] = nge[idx];
        }

        return ans;
        
    }
}