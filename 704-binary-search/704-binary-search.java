class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length-1, low = 0;
        int mid = (high+low)/2;
        while(low <= high){
            
            if(nums[mid] == target){
                return mid;
            }            
            if(nums[mid] > target){
                high = mid-1;
                mid = (high+low)/2;
        }
            if(nums[mid]  < target){
                low = mid+1;
                mid = (high+low)/2;
            }
        }
        return -1;
    }
}