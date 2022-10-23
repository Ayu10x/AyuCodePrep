class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     Arrays.sort(nums);
        
        List<List<Integer>> res = new LinkedList<>();
        
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || nums[i] != nums[i-1]){
                
                int lo = i+1, hi=nums.length-1, sum = 0 - nums[i];
                
                while(lo < hi){
                    if(nums[lo]+nums[hi] == sum){
                        
                        res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                        
                        while(lo<hi && nums[lo] == nums[lo+1]) lo++; //skipping identical lows
                        while(lo<hi && nums[hi] == nums[hi-1]) hi--; //skipping identical high's
                        
                        lo++;
                        hi--;
                }
                    else if(nums[lo] + nums[hi] < sum) lo++;
                    else hi--;
                }
        }
    }
        return res;
    }
}