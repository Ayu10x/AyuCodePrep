class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==nums[i+1]) return true;
        // }
        // return false;
        
        HashSet<Integer> tt = new HashSet<>();
        for(int a : nums){
            if(tt.contains(a)) return true;
        tt.add(a);
        }
        
        return false;
    }
}