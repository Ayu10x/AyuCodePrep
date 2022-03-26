class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        int current = nums[0];
        int toFill = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] != current){
                current  = nums[i];
                nums[toFill] = current;
                toFill++;
            }
        }
        return toFill;
    }
}