class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] count = new int[26];
        
        for(int i=0; i<sentence.length(); i++)
            count[sentence.charAt(i)-'a']++;
        //checking for every element
        for(int e : count)
            if(e < 1) return false;
        return true;
    }
}