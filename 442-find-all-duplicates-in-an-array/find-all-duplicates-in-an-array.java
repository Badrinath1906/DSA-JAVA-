class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(set.contains(num)) res.add(num);
            else  set.add(num);
        }
        
        return res;
    }
}