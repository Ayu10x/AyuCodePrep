class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> appear = new HashMap<Integer, Integer>();
        for(int i=0; i < nums.length; i++){
            appear.put(nums[i], i);
        }
        for(int i=0; i < nums.length; i++){
            if(appear.containsKey(target - nums[i])){
            int j = appear.get(target - nums[i]);
                                                     
            if(i != j){
             result[0] = Math.min(i, j);
             result[1] = Math.max(i, j);
             return result;   
            }                                         
                                                     
            }
        }
        return result;
    }
}