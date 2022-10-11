class Solution {
    public int pivotIndex(int[] nums) {
        int totSum = 0;
        for(int j = 0; j<nums.length; j++){
            totSum +=nums[j];
        }
        int leftSum = 0, rightSum = totSum  - nums[0];
        int i = 1;
        while(leftSum != rightSum && i < nums.length){
            leftSum += nums[i-1];
            rightSum -= nums[i];
            i++;
        }
        int ans = (leftSum == rightSum) ? i-1 : -1;
        return ans;
    }
}