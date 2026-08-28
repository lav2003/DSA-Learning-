class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int zero = 0;
        int one = 0;
        int res = 0;
        for(int i = 0; i<nums.length ;i++){
            if(nums[i] == 0){
                zero++;
            }
            else{
                one++;
            }
            int diff = zero - one;
            if(mp.containsKey(diff)){
                res = Math.max(res, i-mp.get(diff));
            }
            else{
                mp.put(diff,i);
            }
        }
        return res;
        
    }
}