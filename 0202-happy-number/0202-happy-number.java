class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        while (n != 1) {
            if (mp.containsKey(n)) {
                return false;
            }
            mp.put(n, 1);
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                n = n / 10;
                sum = sum + d * d;
            }
            n = sum;
        }
        return true;
    }
}