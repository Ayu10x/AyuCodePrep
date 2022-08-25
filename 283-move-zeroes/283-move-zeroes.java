class Solution {
    public void moveZeroes(int[] nums) {
        int chintu, mintu = 0;
        for(chintu=0; chintu< nums.length; chintu++){
            if(nums[chintu] != 0){
                swap(nums, chintu, mintu++);
            }
        }
    }
     private void swap(int[] arr, int i , int j){
           int temp = arr[i];
        arr[i] = arr[j];
            arr[j] = temp;
       }
}