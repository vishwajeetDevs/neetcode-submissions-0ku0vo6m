class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        Stack <String> finalResult = new Stack<>();
        int n = path.length();
        int count = 0;
        for (int i = 0 ; i < n; i++) {
            char current = path.charAt(i);
            if(i == 0) {
                continue;
            }
            while (i < n && path.charAt(i) != '/') {
                sb.append(path.charAt(i));
                i++;
            }


            String token = sb.toString();
            sb.setLength(0);

            if (token.equals("..")) {
                if (!st.isEmpty()) st.pop();
            } else if (!token.equals("") && !token.equals(".")) {
                st.push(token);
            }
        }

        while(!st.isEmpty()) {
            finalResult.push(st.pop());
        }
        while (!finalResult.isEmpty()) {
            res.append("/");
            res.append(finalResult.pop());
        }
        if(res.length() == 0) {
            return "/";
        } else {
            return res.toString();
        }
    }
}