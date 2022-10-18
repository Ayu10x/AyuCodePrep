class Solution {
    public int searchInsert(int[] nums, int target) {
        int h = nums.length - 1;
        int l = 0;
        
        while(l <= h){
            int m = l+(h-l)/2;
            if(nums[m] == target){
                return m;
            } else if(nums[m] > target){
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        return l;
    }
}