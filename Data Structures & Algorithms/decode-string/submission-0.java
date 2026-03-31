class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> result = new Stack<>();
        String curr = "";
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); // build multi-digit number
            } else if (ch == '[') {
                count.push(num);
                result.push(curr);
                num = 0;
                curr = "";
            } else if (ch == ']') {
                String temp = curr;
                curr = result.pop();
                int repeat = count.pop();
                curr += temp.repeat(repeat); // Java 11+ repeat method
            } else {
                curr += ch;
            }
        }
        return curr;
    }
}
