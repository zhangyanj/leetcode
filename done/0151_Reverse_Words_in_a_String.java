public class Solution {
    public String reverseWords(String s) {
        if (s.equals("")) {
            return "";
        }
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            ss= ss + s.charAt(s.length() - 1 - i);
        }
        String ans = "";
        Stack<Character> stack  = new Stack<Character>();
        for (int i = 0; i < ss.length(); i++) {
            while (i < ss.length()&&ss.charAt(i) != ' ') stack.push(ss.charAt(i++));
            while (!stack.isEmpty()) {
                ans= ans+stack.pop();
            }
            ans= ans+" ";
            while (i < ss.length()&&ss.charAt(i) == ' ') i++;
        }
        return ans.trim();
        
    }
}
