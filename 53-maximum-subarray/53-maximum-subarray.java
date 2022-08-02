class Solution {
    public int maxSubArray(int[] nums) {
        
        //Kadane's Algo
        int maxSoFar = Integer.MIN_VALUE, maxHere = 0;
        
        for(int i=0; i<nums.length; i++){
            maxHere = nums[i] + maxHere;
            
            if(maxSoFar < maxHere){
                maxSoFar = maxHere;
            }
            if(maxHere < 0){
                maxHere = 0;
            }
        }
        return maxSoFar;
    }
}