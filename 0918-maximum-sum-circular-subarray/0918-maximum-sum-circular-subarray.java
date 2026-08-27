class Solution {
    public int maxSum(int[] nums) {
        int curr = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            ans = Math.max(ans, curr);
        }
        return ans;
    }
    public int minSum(int[] nums) {
        int curr = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.min(nums[i], curr + nums[i]);
            ans = Math.min(ans, curr);
        }
        return ans;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        for (int n : nums){ 
            sum += n;
        }
        int max = maxSum(nums);
        if (max < 0){
            return max;
        }

        return Math.max(max, sum - minSum(nums));
    }
}