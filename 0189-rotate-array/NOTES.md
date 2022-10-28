class Solution {
public void rotate(int[] nums, int k) {
int n = nums.length;
if(n <= 1) return; //Base case
k=k%n; //when k is greater than the length of the array
if(k == 0) return;  //Base case:
swap(nums, 0, n-1);
swap(nums, 0, k-1);
swap(nums, k, n-1);
}
void swap(int[] nums, int l, int r){
while(l<r){
int temp = nums[l];
nums[l] = nums [r];
nums[r] = temp;
l++;
r--;
}
}
}