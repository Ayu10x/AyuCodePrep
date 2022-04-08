class KthLargest {
    int k;
    List<Integer> nums_arry = new ArrayList();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        
        for(int num : nums) {
            this.nums_arry.add(num);
        }
    }
    
    public int add(int val) {
        this.nums_arry.add(val);
        
        Collections.sort(this.nums_arry, Collections.reverseOrder());
        
        return this.nums_arry.get(this.k-1);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */