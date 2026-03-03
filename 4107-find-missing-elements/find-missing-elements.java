class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>list= new ArrayList<>();
        HashSet<Integer>set= new HashSet<>();
        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int el: nums){
           set.add(el); 
           min=Math.min(min,el);
           max =Math.max(max,el);
        }
        for(int i= min; i<+max;i++){
            if(!set.contains(i)) list.add(i);
        }
        return list;
        
    }
}