class Solution {
    public int search(int[] nums, int target) {
        int end = nums.length-1, start = 0;
        int mid = (start + end) / 2;
        while(start <= end)
{        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] > target){
            end = mid-1;
            mid = (start + end) / 2;
        }
        if(nums[mid] < target){
            start = mid+1;
            mid = (start + end) / 2;
        }
        
}
        return -1;
    }
}