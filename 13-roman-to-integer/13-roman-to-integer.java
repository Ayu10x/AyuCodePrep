public class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> roman= new HashMap<>();
        roman.put("M", 1000);
        roman.put("CM", 900);
        roman.put("D", 500);
        roman.put("CD", 400);
        roman.put("C", 100);
        roman.put("XC", 90);
        roman.put("L", 50);
        roman.put("XL", 40);
        roman.put("X", 10);
        roman.put("IX", 9);
        roman.put("V", 5);
        roman.put("IV", 4);
        roman.put("I", 1);

        int result = 0;
        for(int i=0; i< s.length();i++){
            String w = s.substring(i, i<= s.length()-2 ? i+ 2 : i+1);
            if(roman.containsKey(w)){
                result += roman.get(w);
                if(w.length() == 2)i++;
            }else{
                result += roman.get(s.substring(i, i+1));
            }
        }

        return result;

    }
}