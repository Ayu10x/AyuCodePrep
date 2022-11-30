class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int n : arr) hs.put(n, hs.getOrDefault(n, 0)+1);
        HashSet<Integer> unq = new HashSet<>(hs.values());
        return unq.size() == hs.size();
    }
}
