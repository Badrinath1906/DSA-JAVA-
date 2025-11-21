class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[n];
        st.push(n - 1);
        nge[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0)
                nge[i] = 0;
            else
                nge[i] = st.peek() - i;
            st.push(i);
        }
        return nge;
    }
}