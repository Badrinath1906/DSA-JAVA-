class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            st.push(sandwiches[i]);

        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            q.add(students[i]);
        }
        int count = 0;

        while (st.size() > 0 && count <= q.size()) {
            if (q.peek() == st.peek()) {
                q.remove();
                st.pop();
                count = 0;
            } else
                q.add(q.remove());
            count++;
        }
        return q.size();
    }
}