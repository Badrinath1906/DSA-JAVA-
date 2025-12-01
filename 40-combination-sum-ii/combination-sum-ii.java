class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer>curr= new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates,target,0,curr,ans);
        return ans;
    }
    public void combination(int[]candidates, int target, int index, ArrayList<Integer>curr,List<List<Integer>>ans){
        //base case
            if( target==0) {
                  ans.add(new ArrayList<>(curr));
            return;
            }
        
    for(int i=index;i<candidates.length;i++){
        if((i==index || candidates[i-1]!=candidates[i]) &&candidates[index]<=target){
            curr.add(candidates[i]);
            combination(candidates,target-candidates[i],i+1,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
        
    }
}