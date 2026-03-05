class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int n= nums.length;
        for(int el:nums){
            map.put(el,map.getOrDefault( el, 0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/3) ans.add(key);
        }
        return ans;
        
    }
}