class Solution {
    public void reverseString(char[] s) {
        recur(s, 0, s.length-1);
    }
    public void recur(char []s, int left, int right){
        if(left >= right){
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        
        recur(s, left+1, right-1);
    }
}