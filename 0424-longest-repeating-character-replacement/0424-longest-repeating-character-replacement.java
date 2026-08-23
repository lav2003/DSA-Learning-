class Solution {
    public int find(int[] freq){
        int max = 0;
        for(int i = 0; i<256; i++){
            max = Math.max(max,freq[i]);
        }
        return max;
    }

    public int characterReplacement(String s, int k) {
        int[] freq = new int[256];

        int l = 0;
        int h = 0;
        int res = 0;
        while(h<s.length()){
            freq[s.charAt(h)]++;
            int len = h-l+1;
            int maxFreq = find(freq);
            int diff = len - maxFreq;
            while(diff>k){
                freq[s.charAt(l)]--;
                l++;
                len = h-l+1;
                maxFreq = find(freq);
                diff = len - maxFreq;

            }
            len = h-l+1;
            res = Math.max(len,res);
            h++;
        }
        return res;
        
        
    }
}