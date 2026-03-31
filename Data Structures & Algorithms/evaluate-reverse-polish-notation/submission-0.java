class Solution {
    public boolean checkString(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> val = new Stack<>();
        for (int i = 0 ; i < tokens.length; i++) {
            if(checkString(tokens[i])) {
                val.push(Integer.parseInt(tokens[i]));
                System.out.println("running");
            } else if ( tokens[i].charAt(0) == '+' ) {
                int v2 = val.pop();      
                int v1 = val.pop(); 
                int res = v1 + v2;   
                val.push(res);
            } else if ( tokens[i].charAt(0) == '-' ) {
                int v2 = val.pop();      
                int v1 = val.pop(); 
                int res = v1 - v2; 
                val.push(res);
            } else if ( tokens[i].charAt(0) == '*' ) {
                int v2 = val.pop();      
                int v1 = val.pop(); 
                int res = v1 * v2; 
                val.push(res);
            } else if ( tokens[i].charAt(0) == '/' ) {
                int v2 = val.pop();      
                int v1 = val.pop(); 
                int res = v1 / v2; 
                val.push(res);
            }
        }
        return val.pop();
    }
}