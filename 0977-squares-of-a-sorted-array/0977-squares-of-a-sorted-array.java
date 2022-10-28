class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int index = n-1;
        int s = 0, e = n-1;
        
        while(s<=e)
        {
            if(Math.abs(nums[s]) < Math.abs(nums[e])){
                res[index--] = nums[e]*nums[e];
                e--;
            }else{
                res[index--] = nums[s] *nums[s];
                s++;
            }
        }
        return res;
    }
}