class Solution {
    public boolean boolSahi(int[] have, int[] needed) {
        for (int i = 0; i < 256; i++) {
            if (have[i] < needed[i]) {
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int[] have = new int[256];
        int[] needed = new int[256];
        for (int i = 0; i < t.length(); i++) {
            needed[t.charAt(i)]++;
        }
        int l = 0;
        int res = Integer.MAX_VALUE;
        int start = 0;
        for (int h = 0; h < s.length(); h++) {
            have[s.charAt(h)]++;
            while (boolSahi(have, needed)) {

                int len = h - l + 1;
                if (len < res) {
                    res = len;
                    start = l;
                }
                have[s.charAt(l)]--;
                l++;
            }
        }
        if (res == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + res);
    }
}