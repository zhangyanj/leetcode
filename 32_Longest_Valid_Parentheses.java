class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        char[] arr = s.toCharArray();
        int len = arr.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == '(') {
                stack.push(-1);
            } else {
                if (stack.size() == 0) {
                    continue;
                } else if (stack.size() == 1){
                    if (stack.peek() == -1) {
                        stack.pop();
                        max = max > 2?max:2;
                        stack.push(2);
                    } else {
                        max = max > stack.peek()?max:stack.peek();
                        stack.pop();
                    }
                } else {
                    if (stack.peek() == -1) {
                        stack.pop();
                        if (stack.peek() != -1) {
                            int temp = stack.pop() + 2;
                            stack.push(temp);
                            max = max > temp?max:temp;
                        } else {
                            max = max > 2?max:2;
                            stack.push(2);   
                        }
                    } else {
                        int temp = stack.pop();
                        stack.pop();
                        temp += 2;
                        if (!stack.isEmpty()&&stack.peek()!=-1) {
                            temp+=stack.pop();
                        }
                        stack.push(temp);
                        max = max > temp?max:temp;
                    }
                }
            }
        }
        return max;
    }
}
