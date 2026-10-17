class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        fun(0, 0, n, "", res);
        return res;
    }
    public void fun(int open, int close, int n,String s, List<String> res) {
        if (close == n) {
            res.add(s);
            return;
        }
        if (open < n) {
            fun(open + 1, close, n, s+"(", res);
        }
        if (close < open) {
            fun(open, close + 1, n, s+")", res);
        }
    }
}