class Solution {
  public  List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        rec(n , "" , ans );
        return ans;
    }

      void rec(int n , String s , List<String> ans) {
        if (s.length() == n*2) {
            if (valid(s)) {
                ans.add(s);
            }
            return;
        }
        rec(n,s+"(" , ans);
        rec(n, s+")" , ans);
    }

    public  boolean valid(String str) {
        int res = 0 ;
        for (int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) == '(') res++;
            else res--;
            if (res < 0) return false;
        }
        return res == 0 ;
    }
}