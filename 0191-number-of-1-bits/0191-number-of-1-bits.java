public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // int pivot = 1;
        // int sum = 0;
        // for (int i = 0; i < 32; i ++){
        //     int p = pivot << i;
        //     if ((n & p) == p)
        //         sum ++;
        // }
        // return sum;
         int c=0;
        String st=Integer.toBinaryString(n);
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)=='1')
                c++;
        }
        return c;
    }
}