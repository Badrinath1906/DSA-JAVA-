class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        List<Integer>ans =new ArrayList<>();
        HashSet<Integer>set = new HashSet<>();
        for(int num:nums){
            set.add(num);
           max=  Math.max(num,max);
           min=  Math.min(num,min);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i))  ans.add(i);
            min++;

        }  
        return ans;  
        
        
    }
}