class Solution {
public String longestCommonPrefix(String[] strs) {
if(strs.length == 0) return "";
if (strs.length == 1) {
return strs[0];
}
String p = strs[0];
for(int i=1; i<strs.length; i++){
while(strs[i].indexOf(p) !=0){
p = p.substring(0, p.length()-1);;
}
}
return p;
}
}