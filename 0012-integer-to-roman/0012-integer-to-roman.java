public class Solution {
    public String intToRoman(int num) {
        String[] symbol = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] value = new int[]{1000,900,500,400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int k = 0;
        StringBuilder sb = new StringBuilder();
        while(num >= 0 && k < value.length){
            while(num >= value[k]){
                num -= value[k];
                sb.append(symbol[k]);
            }
            k++;
        }

        return sb.toString();
    }
}