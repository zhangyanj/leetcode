class Solution {
    public String simplifyPath(String path) {
        char[] arr = path.toCharArray();
        int len = arr.length;
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < len; i++) {
            while (i<len&&arr[i] == '/')i++;
            String str = "";
            while (i<len&&arr[i] != '/') str+=arr[i++];
            if (str.equals(".")||str.equals("")) {
                continue;
            }
            if (str.equals("..")&&!stack.isEmpty()) {
                stack.pop();
            } else {
                if (str.equals("..")) {
                    continue;
                }
                stack.push(str);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        String ans = "";
        while (!stack.isEmpty()) {
            ans="/"+stack.pop()+ans;
        }
        return ans;
    }
}
