class Solution {
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE/2;
        int ans = arr[0];

        for(int i = 1; i<arr.length ;i++){
            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;

            noDelete = Math.max(arr[i], arr[i]+prevNoDelete);
            oneDelete = Math.max(prevOneDelete + arr[i],prevNoDelete );
            ans = Math.max(ans,Math.max(noDelete,oneDelete));
        }
        return ans;


    }
}