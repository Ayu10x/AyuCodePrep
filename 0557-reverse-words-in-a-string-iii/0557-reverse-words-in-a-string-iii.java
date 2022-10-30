class Solution {
    public String reverseWords(String s) {
        // First I create a Char-Array to store my values
        char[] arr = s.toCharArray();
        int n = arr.length, i=0, l=0, r=0;
        
        // Then I'm searching in array
        while(i<n) {
            // If I find a space or at the end, I am starting to reverse
            if(arr[i] == ' ' || i == n-1) {
                // Here I used two-pointer approach
                // r for last(right) value and l for first(left) value
                if (i == n-1) r=i;
                else r = i-1;
                while(r>l){
                    char temp = arr[r];
                    arr[r] = arr[l];
                    arr[l] = temp;
                    l++;
                    r--;
                }
                // After reverse I am hiding the value of l(first) so I can use it in next reverse
                i++;
                l = i;
            }
            else i++;
        }
        // Lastly converting array to String and return it
        return new String(arr);
    }
}