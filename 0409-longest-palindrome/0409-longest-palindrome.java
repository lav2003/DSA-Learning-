class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> f = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            f.put(s.charAt(i), f.getOrDefault(s.charAt(i), 0) + 1);
        }
        boolean odd = false;
        int res = 0;
        for (char c : f.keySet()) {
            int val = f.get(c);
            if (val % 2 == 0) {
                res += val;
            }else {
                res += val - 1;
                odd = true;
            }
        }
        if (odd) {
            res++;
        }
        return res;
    }
}