class Solution {
    public int maximumSum(int[] nums){
        int bestEnd = nums[0];
        int ans = nums[0];
        for(int i =1; i<nums.length; i++){
            bestEnd = Math.max(nums[i],nums[i]+bestEnd);
            ans = Math.max(ans,bestEnd);

        }
        return ans;
    }
    public int minimumSum(int[] nums){
        int bestEnd = nums[0];
        int ans = nums[0];
        for(int i =1; i<nums.length; i++){
            bestEnd = Math.min(nums[i],nums[i]+bestEnd);
            ans = Math.min(ans,bestEnd);

        }
        return ans;

    }
    public int maxAbsoluteSum(int[] nums) {
        return Math.max(Math.abs(maximumSum(nums)), Math.abs(minimumSum(nums)));
    }

}