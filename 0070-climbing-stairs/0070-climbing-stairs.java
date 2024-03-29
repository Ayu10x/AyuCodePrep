class Solution {
    public int climbStairs(int n) {
         //simple dp
        if(n<=2) return Math.max(n, 0); // or n > 0 ? n : 0;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}