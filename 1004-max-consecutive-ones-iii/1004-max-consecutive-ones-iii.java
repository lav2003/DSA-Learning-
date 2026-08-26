class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int zero = 0;
        int res = 0;
        for (int h = 0; h < nums.length; h++) {
            if (nums[h] == 0) {
                zero++;
            }
            while (zero > k) {
                if (nums[l] == 0) {
                    zero--;
                }
                l++;
            }
            int len = h - l + 1;
            res = Math.max(res, len);
        }
        return res;
    }
}
