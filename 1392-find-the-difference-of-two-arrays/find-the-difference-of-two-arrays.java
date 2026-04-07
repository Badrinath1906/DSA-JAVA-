class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }
        for (int x : set1) {
            if (!set2.contains(x))
                list1.add(x);
        }
        ans.add(list1);

        for (int x : set2) {
            if (!set1.contains(x))
                list2.add(x);
        }
        ans.add(list2);

        return ans;
    }
}