class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote == null) {return false;}
        if(magazine == null) {return false;}
        
        if(ransomNote.length()  >  magazine.length()) {return false;}
        
       int[] freq = new int[26];
        for(char c : magazine.toCharArray()){
            freq[c - 'a'] += 1;
        }
        for(char c : ransomNote.toCharArray()){
            if(freq[c - 'a'] == 0){ return false; }
            freq[c - 'a'] -= 1;
        }
        return true;
    }
}