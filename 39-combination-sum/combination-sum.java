class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer>curr= new ArrayList<>();
        combination(candidates,target,0,curr,ans);
        return ans;
    }
    public void combination(int[]candidates, int target, int index, ArrayList<Integer>curr,List<List<Integer>>ans){
        //base case
        if(index==candidates.length){
            if( target==0) {
                  ans.add(new ArrayList<>(curr));
            }
            return;
            
        }
        
        //pick
        if(candidates[index]<=target){
            curr.add(candidates[index]);
            combination(candidates,target-candidates[index],index,curr,ans);
            curr.remove(curr.size()-1);
        }
        //no pick
        combination(candidates,target,index+1,curr,ans);
    }
}