class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0;
        int right= arr.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(arr[mid]< arr[mid+1])  left= mid+1;
            else  right= mid;
        }
        return left; // return right or left both becauze left== right at same index
    }
}