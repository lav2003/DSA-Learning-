class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int l = 0;
        int res = 0;
        for (int h = 0; h < s.length(); h++) {
            char ch = s.charAt(h);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            while (freq.get(ch) > 1) {
                char x = s.charAt(l);
                freq.put(x, freq.get(x) - 1);
                if (freq.get(x) == 0) {
                    freq.remove(x);
                }
                l++;
            }
            int len = h - l + 1;
            res = Math.max(res, len);
        }
        return res;
    }
}