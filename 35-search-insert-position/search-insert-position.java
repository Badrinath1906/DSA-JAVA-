class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums,target,0, nums.length-1);
    }
    private int search(int[]nums,int target, int s,int end){
        int n=nums.length;
        int mid = s+(end-s)/2;
        if(s>end)  return s;
            if(target==nums[mid]) return mid;
            if(target < nums[mid]) return search(nums, target,s, mid-1);
            else{
                return search(nums,target,mid+1,end);
            }
        }
    }
