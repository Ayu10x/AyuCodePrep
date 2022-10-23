class Solution {
public List<List<Integer>> threeSum(int[] nums) {
List<List<Integer>> result = new ArrayList<>();
if(nums.length < 3){
return result;
}
Arrays.sort(nums);
Set<String> unique = new HashSet<>();
for(int i=0; i<nums.length; i++){
for(int j=i+1; j<nums.length; j++){
for(int k=j+1; k<nums.length; k++){
if(nums[i]+nums[j]+nums[k] == 0){
String seq =""+nums[i]+nums[j]+nums[k];
if(!unique.contains(seq)){
List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
result.add(temp);
unique.add(seq);
}
}
}
}
}
return result;
}
}
------------------------------------------------------------
​
​
​