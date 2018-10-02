class Solution {
    public int evalRPN(String[] tokens) {
        int len = tokens.length;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < len; i++) {
            if (tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")) {
                int sec = stack.pop();
                int fir = stack.pop();
                int ans = 0;
                if (tokens[i].equals("+")) {
                    ans = fir + sec;
                }
                if (tokens[i].equals("-")) {
                    ans = fir - sec;
                }
                if (tokens[i].equals("*")) {
                    ans = fir*sec;
                }
                if (tokens[i].equals("/")) {
                    ans = fir/sec;
                }
                stack.push(ans);
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
