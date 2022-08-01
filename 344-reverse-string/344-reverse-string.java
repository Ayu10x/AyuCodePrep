class Solution {
    public void reverseString(char[] s) {
        recur(s, 0,s.length-1);
    }
    public void recur(char[] s, int l, int r){
        if(l >=r){
            return;
        }
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        
        recur(s, l+1, r-1);
    }
}