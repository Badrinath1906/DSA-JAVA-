class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]ans = new int[k];
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<k;i++){
            int maxFreq =0;
            int element =0;
            for(int num :map.keySet()){
                if(map.get(num)>=maxFreq){
                    maxFreq = Math.max(maxFreq , map.get(num));
                    element = num;   
                }            
            }
            ans[i] =element;
            map.remove(element);
        }
        return ans;
    }
}