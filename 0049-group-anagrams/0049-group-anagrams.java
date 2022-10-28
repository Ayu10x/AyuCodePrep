class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> res =  new ArrayList<List<String>>();
        HashMap<String, Integer> helper =  new HashMap<String, Integer>();
        for(int i=0; i < strs.length; i++){
            char[] tmpChar = strs[i].toCharArray();
            Arrays.sort(tmpChar);
            String tmp = new String(tmpChar);
            if(helper.containsKey(tmp)){
                res.get(helper.get(tmp)).add(strs[i]);
                continue;
            }
            List<String> curr = new LinkedList<String>();
            curr.add(strs[i]);
            res.add(curr);
            helper.put(tmp, res.size()-1);
        }
        return res;
    }
}