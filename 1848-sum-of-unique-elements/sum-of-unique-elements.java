class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for (int ele : nums) {
            if (!unique.contains(ele) && !duplicate.contains(ele))
                unique.add(ele);
            else {
                unique.remove(ele);
                duplicate.add(ele);
            }
        }
        int sum = 0;
        for (int el : unique) {
            sum += el;
        }
        return sum;
    }
}