class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        //sum of array = left + right + nums[i];
        int sum = 0;
        int left = 0;
        int right = 0;

        for(int i = 0 ; i<n ;i++){
            sum += nums[i];
        }
        if(sum - nums[0] == 0) return 0;//zero checking
        for(int i = 1; i<n ;i++){
            left += nums[i-1];
            right = sum -left-nums[i];
            if(left == right){
                return i;
            }
           
        }
        return -1;
    }
}


// class Solution {
//     public int pivotIndex(int[] nums) {
//         int n = nums.length;
//         int[] prefix = new int[n];
//         int[] suffix = new int[n];

//         for(int i = 1; i < n; i++){
//             prefix[i] = prefix[i-1] + nums[i-1];
//         }
//         for(int i = n-2; i >= 0; i--){
//             suffix[i] = suffix[i+1] + nums[i+1];
//         }
//         for(int i = 0; i < n; i++){
//             if(prefix[i] == suffix[i]){
//                 return i;
//             }
//         }   
//         return -1;
//     }
// }