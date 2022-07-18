class Solution {
    public boolean isValid(String s) {
          Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (  ( s.charAt(i) == ']' ||  s.charAt(i) == ')' ||  s.charAt(i) == '}' ) && deque.isEmpty() ) return false;


            if (ch == '[' || ch == '(' || ch == '{') {
                deque.push(ch);
            }

            else {
                if (ch == ']' && deque.pop() != '[') {
                    return false;
                }
                if (ch == ')' && deque.pop() != '(') {
                    return false;
                }
                if (ch == '}' && deque.pop() != '{') {
                    return false;
                }
            }
        }


        return deque.isEmpty();
    }
}