class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int min = Integer.MAX_VALUE;

        for(int key : map.keySet()){
            if(map.get(key) >= 3){
                list.clear();
                for(int i = 0; i < nums.length; i++){
                    if(nums[i] == key)   list.add(i);
                        
                }

                for(int i = 0; i <= list.size() - 3; i++){
                    int dist = 2 * (list.get(i + 2) - list.get(i)); 
                    min = Math.min(min, dist);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}