class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int n = mat.length, m = mat[0].length, k=0;
        
        while(r*c != n*m) return mat;
        
        int res[][]= new int [r][c];
        
        
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++, k++)

                res[i][j] = mat[k/m][k%m];
        
        return res;
        
    }
}