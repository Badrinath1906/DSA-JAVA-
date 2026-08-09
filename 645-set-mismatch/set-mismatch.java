class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
            
        }
        int missing =-1;
        int repeating =-1;

        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)) missing =i;
            else if(map.get(i)>1)  repeating =i;
        }
        return new int[]{repeating, missing};
        
    }
}