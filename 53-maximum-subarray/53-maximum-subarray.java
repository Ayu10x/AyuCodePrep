class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSoFar = Integer.MIN_VALUE , maxEndHere =0;
        int n=nums.length;
        
        for(int i=0; i<n; i++){
            
            maxEndHere = maxEndHere + nums[i];
            
            if(maxSoFar < maxEndHere){
                maxSoFar = maxEndHere;
            }
            if(maxEndHere < 0){
                maxEndHere = 0;
            }
        }
        return maxSoFar;
    }
}