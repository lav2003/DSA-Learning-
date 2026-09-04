class Solution {
    public int rob(int[] nums) {
        return fun(nums,0, new HashMap<>());
        
    }
    int fun(int[] nums,int i , HashMap<Integer,Integer> dp){
        if(i>= nums.length){
            return 0;
        }
        if(dp.containsKey(i)){
            return dp.get(i);
        }
        int c1 = nums[i] + fun(nums,i+2,dp);
        int c2 = fun(nums,i+1,dp);
        int ans = Math.max(c1,c2);
        dp.put(i,ans);
        return ans;
    }
}