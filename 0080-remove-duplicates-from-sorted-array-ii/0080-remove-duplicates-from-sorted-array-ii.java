class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if(count <= 2) {
                nums[max] = nums[i];
                max++;
            }
        }
        return max;
    }
}