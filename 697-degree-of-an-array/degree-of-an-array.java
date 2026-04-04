import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        
        int degree = 0;
        int minLength = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            first.putIfAbsent(num, i); // store first index...
            count.put(num, count.getOrDefault(num, 0) + 1);
            
            int freq = count.get(num);
            
            if (freq > degree) {
                degree = freq;
                minLength = i - first.get(num) + 1;
            } 
            else if (freq == degree) {
                minLength = Math.min(minLength, i - first.get(num) + 1);
            }
        }
        
        return minLength;
    }
}
  