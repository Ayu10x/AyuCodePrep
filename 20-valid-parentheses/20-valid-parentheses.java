class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
            stack.push(ch);
            }else{
                char pair = map.get(ch);
                if(stack.isEmpty() || stack.peek() != pair) return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }
}