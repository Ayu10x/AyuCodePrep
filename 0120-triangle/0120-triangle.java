class Solution {
    
    List<List<Integer>> triangle;
    List<Map<Integer, Integer>> cache;
    
    public int minimumTotal(List<List<Integer>> triangle) {
    
        this.triangle = triangle;
            
            //cache
            cache = new ArrayList<>();
        int N = triangle.size();
        for(int i=0; i<N; i++){
            cache.add(new HashMap<>());
        }
        
        return helper(0,0);
        
    }
    
    private int helper(int row, int col){
        int curVal = triangle.get(row).get(col);
        
        //return current element if we are at the last row
        if(row == triangle.size()-1) return curVal;
        
        Map<Integer, Integer> map = cache.get(row);
        
        if(map.containsKey(col)) return map.get(col); //check if we pre computed this col before
        
        //find the min path sum for next rows
        int path1 = helper(row + 1 , col);
        int path2 = helper(row + 1,  col + 1);
        
        //cache the computed result
        map.put(col, Math.min(path1, path2) + curVal);
        
        return map.get(col);
        
    }
}