class Solution {
    public boolean isPalindrome(String s) {
        if (s.equals("")) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')||(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')||(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                char ss = s.charAt(i);
                if (ss >= 'A' && ss <= 'Z') {
                    ss+=32;
                }
                stack.push(ss);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')||(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')||(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                char pp = stack.pop();
                char ss = s.charAt(i);
                if (ss >= 'A' && ss <= 'Z') {
                    ss+=32;
                }
                System.out.println(pp);
                System.out.println(ss);
                if (ss != pp) {
                    return false;
                }   
            }
        }
        return true;
    }
}
