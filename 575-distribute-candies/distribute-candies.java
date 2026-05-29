class Solution {
    public int distributeCandies(int[] candyType) {
       HashSet<Integer>set = new HashSet<>();
       for(int num:candyType){
        set.add(num);
       }
       int min = Math.min(set.size(),candyType.length/2);
       return min;

    }
}