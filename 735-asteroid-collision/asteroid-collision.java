class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {
            while (st.size() > 0 && st.peek() > 0 && a < 0) {
                int top = st.peek();
                if (top < -a) {
                    st.pop();
                } else {
                    if (top == -a){
                        st.pop();
                        a= 0;
                    }    
                    else { //top >= -a
                        a = 0;
                    }
                    break;
                    
                }
            }
            if (a != 0)
                st.push(a);
        }

        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
