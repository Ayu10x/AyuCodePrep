class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //Using HashTable:
        
        // HashSet<Integer> set = new HashSet<>();
        // for(int a : nums){
        //     if(set.contains(a)) return true;
        //     set.add(a);
        // }
        // return false;
        
        //Using Sorting Approach
        
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}