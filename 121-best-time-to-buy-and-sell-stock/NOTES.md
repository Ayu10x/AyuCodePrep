**Brute Force** : TC: o(n^2) and SC: o(1)
static int maxProfit(int[] arr){
int maxPro=0;
for(int i=0; i< arr.length; i++){
for(int j=i+1; j< arr.length; j++){
if(arr[j] > arr[i]){
maxProfit = Math.max(arr[j]- arr[i], maxProfit);
}
}
}
return maxPro;
}
----------------------------------------------------------
**OPT SOL** : TC: o(n) // one pass , and SC : o(1)
class Solution {
public int maxProfit(int[] prices) {
int sol=0;
if(prices == null || prices.length <= 1) return sol;
int min = prices[0];
for(int i=1; i<prices.length; i++){
if(prices[i] > min){
sol = Math.max(sol, prices[i] - min);
}else{
min = prices[i];
}
}
return sol;
}
}