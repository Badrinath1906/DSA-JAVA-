class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st = new Stack<>();

        for(int i=0; i<operations.length;i++){
            String opr =operations[i];
            if(opr.equals("C"))   st.pop();
            
            else if(opr.equals("D"))   st.push(st.peek()*2);

            else if(opr.equals("+")){
                int a1 = st.pop();
                int a2 = st.peek();
                int sum= a1+a2;
                st.push(a1);
                st.push(sum);
            }
            else//put an integer in stack
            st.push(Integer.parseInt(opr));
        }
         int total=0;
          for( int x: st){
            total += x;
          }
          return total;
    }
}