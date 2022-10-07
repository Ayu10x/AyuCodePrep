class Solution {
    public void setZeroes(int[][] matrix) {
     int rows=matrix.length, cols=matrix[0].length;
        
        Set<Integer> rs = new HashSet<Integer>();
        Set<Integer> cs = new HashSet<Integer>();
        
        //find the row number and col number and store it in the HashSet
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == 0){
                    rs.add(i);
                    cs.add(j);
                }
            }
        }
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(rs.contains(i) || cs.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }    
    }
}