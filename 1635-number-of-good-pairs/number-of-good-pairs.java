class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int count =0;
        for(int num:nums){
        map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            int n= map.get(key);
            if(n>=2){
                count +=(n*(n-1))/2;
            }
        }
    return count;       
    }
}