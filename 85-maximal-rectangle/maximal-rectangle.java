class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0) return 0;  //  base case..

         int rows = matrix.length;
         int cols = matrix[0].length;
         int[] heights =new int[cols];
         int max=0;
          for ( int i=0; i<rows;i++){
             for( int j=0;j<cols;j++){
                if(matrix[i][j]=='1')  heights[j]+=1;
                else heights[j] =0;
             }
             max= Math.max(max,largestRectangleArea(heights));
          }
            return max;
    }
    
     public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer>st = new Stack<>();
        int nse[]= new int[n];
        int pse[]= new int[n];
        //calculating nse[]...
        st.push(n-1);
        nse[n-1] =n;
        for( int i= n-2;i>=0;i--){
            while(st.size()>0 && heights[st.peek()]>= heights[i]){
                st.pop();
            }
            if(st.size()==0) nse[i]= n;
            else nse[i]= st.peek();
            st.push(i);
        }
        //empty stack for pse[] operation..
        while(st.size()>0) st.pop();

       // calculating pse[]...
            st.push(0);
            pse[0]= -1;
            for( int i=1; i<=n-1; i++){
                while(st.size()>0 && heights[st.peek()]>=heights[i]){
                    st.pop();
                }
                if(st.size()==0) pse[i] = -1;
                else pse[i]= st.peek();
                st.push(i);

            }
            //calculating max area of rectangle..
             int max= -1;
            for( int i =0;i<n; i++){
                 int area = heights[i]*( nse[i]- pse[i]-1);
                 max = Math.max(max, area);
            }
            return max;
     }
        
    }
