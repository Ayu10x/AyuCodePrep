class Solution {
    public int longestPalindrome(String[] words) {
        int pp = 0, p = 0;
        HashMap<String,Integer> freq = new HashMap<>();
        
        for (String w : words)
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        
        for (var e : freq.entrySet())
        {
            var w = e.getKey();
            var f = e.getValue();
            if (w.charAt(0) == w.charAt(1))
            {
                p = Math.max(p, f % 2);
                pp += f/2 * 2;
            }
            else 
            {
                String ww = new StringBuffer(w).reverse().toString();
                pp += Math.min(f, freq.getOrDefault(ww, 0));
            }
        }
        
        return (pp + p) * 2;
    }
}