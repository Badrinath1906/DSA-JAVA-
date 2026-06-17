
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int n = 0; n < numRows; n++) {
            List<Integer> row = new ArrayList<>();
            long val = 1; // Start with nC0 = 1
            for (int k = 0; k <= n; k++) {
                row.add((int) val);
                // Calculate next value: nC(k+1) = nCk * (n - k) / (k + 1)
                val = val * (n - k) / (k + 1);
            }
            triangle.add(row);
        }
        return triangle;
    }
}