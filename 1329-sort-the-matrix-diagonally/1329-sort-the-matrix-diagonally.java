class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length; // row
        int n=mat[0].length; // col
        
        // all the diagonals for row=0
        for(int col=0; col<n; col++){
            sort(mat, 0,col,m,n);
        }
        
        //all the diagonals from row 1 to m for col=0
        for(int row=1; row<m; row++){
            sort(mat,row,0,m,n);
        }
        
        return mat;
    }
    void sort(int [][] mat, int row, int col, int m, int n){
        // List<Integer> values = new ArrayList<>();
        int[] values = new int[101];
        int r=row, c=col;
        while(r<m && c<n){
            // values.add(mat[r][c]);
            values[mat[r][c]]++;
            r++;
            c++;
        }
        // Collections.sort(values);
        
        r=row;
        c=col;
        // int ind=0;
        for(int i=0; i<101; i++){
            if(values[i] > 0){
                int count=values[i];
                while(count-- > 0){
                    mat[r][c] = i;
                    r++;
                    c++;
                }
            }
        }
            
            
            
            
        // while(r<m && c<n){
        //     mat[r][c] = values.get(ind++);
        //     r++;
        //     c++;
        // }
    }
}