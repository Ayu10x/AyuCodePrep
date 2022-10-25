class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int res[] =  new int[n];
        int m=arr[n-1];
        res[n-1] = -1;
        for(int i=n-2; i>=0; i--){
            res[i]=m;
            if(arr[i]>=m){
                m=arr[i];
            }
        }
        //Collections.reverse(res);
        return res;
        }
}