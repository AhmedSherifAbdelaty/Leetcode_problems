class Solution {
    public int evalRPN(String[] tokens) {
              Deque<String> stack = new LinkedList<>();
        for (String token : tokens){
            if (!token.equals("*") && !token.equals("/") && !token.equals("+") && !token.equals("-")){
                stack.push(token);
            }else {
                int n2 = Integer.parseInt(stack.pop());
                int n1 = Integer.parseInt(stack.pop());
                int result = perfromOperation(n1 , n2 , token);
                stack.push(String.valueOf(result));
            }
        }
        return Integer.parseInt(stack.peek());
    }
    
        private static int perfromOperation(int n1, int n2, String token) {
        int res = 0 ;
        if (token.equals("+")){
            res = n1 + n2 ;
        }
        if (token.equals("-")){
            res = n1 - n2 ;
        }
        if (token.equals("*")){
            res = n1 * n2 ;
        }
        if (token.equals("/")){
            res = n1 / n2 ;
        }
        return res ;
    }
}