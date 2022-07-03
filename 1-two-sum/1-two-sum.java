class Solution {
    
    //Key value pair -> HashMap
    
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(int i=0 ; i<nums.length; i++){
            int t = target - nums[i];
            if(map.containsKey(t) && map.get(t) != i){ 
                //To check if the t calculated is in the map and the index postion of t is 
                //not equal to i
                res[0] = i;
                res[1] = map.get(t);
            }
        }
        return res;
    }
}