//Bottom-up or Tabulation

class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int [][]dp = new int[n][n];
        for(int d = 2; d < n; ++d){
            for(int i=0; i+d < n; ++i){
                int j = i+d;
               dp[i][j] = Integer.MAX_VALUE;
                for(int k= i+1; k<j; ++k){
                    dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k][j]+ values[i] * values[j]* values[k]);
                }
            }
        }
         return dp[0][n-1];
    }
}






// Basically, for each (i, j), it calculates f[i][k] + f[k][j] + a[i] * a[j] * a[k] across k and keeps only the minimum values.
// f[i][j] = min(f[i][j], f[i][k] + f[k][j] + a[i] * a[j] * a[k])

// When we select k, it divides the polygon specified by (i, j) into three polygons like below. Then, f[i][k], f[k][j] should be calculated already and reuse the results. The last term a[i] * a[j] * a[k] is the triangle created by k.

