class Solution {
    public int fib(int n) {
        
        //Recursion:
        // if(n == 0){
        //     return 0;
        // }else if(n == 1){
        //     return 1;
        // }else{
        //   return  fib(n-2)+fib(n-1);
        // }
        
        //DP:
        int[] dp = new int[n+2];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}