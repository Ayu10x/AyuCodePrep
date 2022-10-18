class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        if(n==2) return "11";
        String s="11";
        for(int i=3; i<=n; i++){
            s=appendTask(s);
        }
        return s;
    }
    
    
    public String appendTask(String s){
        int n=s.length(), c=1;
        StringBuilder ap = new StringBuilder();
        for(int i=1; i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                ap.append(c);
                ap.append(s.charAt(i-1));
                c=1;
            }
        }
        ap.append(c);
        ap.append(s.charAt(n-1));
        return ap.toString();
    }
}