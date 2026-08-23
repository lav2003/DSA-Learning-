class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int l = 0;
        int res = 0;
        for (int h = 0; h < fruits.length; h++) {
            freq.put(fruits[h], freq.getOrDefault(fruits[h], 0) + 1);
            while(freq.size()>2){
                int x = fruits[l];
                freq.put(x,freq.get(x)-1);
                if(freq.get(x)==0){
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