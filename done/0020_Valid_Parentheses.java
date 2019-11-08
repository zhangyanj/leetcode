class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        if (len == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < len; i++) {
            if (stack.isEmpty()||arr[i]=='('||arr[i]=='['||arr[i]=='{') {
                stack.push(arr[i]);
            } else {
                if (arr[i]==')') {
                    if (stack.peek()!='(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
                if (arr[i]==']') {
                    if (stack.peek()!='[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
                if (arr[i]=='}') {
                    if (stack.peek()!='{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
