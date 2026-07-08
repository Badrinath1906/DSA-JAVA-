class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int[]res =new int[k];
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int i=0; i<k;i++){
            int maxFreq =0;
            int element =0;
            for(int key: map.keySet()){
               if(map.get(key) >= maxFreq){
                maxFreq = Math.max(maxFreq, map.get(key));
                element =key;
                }
            }
        res[i] = element;    
        map.remove(element);
        }
        
        return res;
        
    }
}