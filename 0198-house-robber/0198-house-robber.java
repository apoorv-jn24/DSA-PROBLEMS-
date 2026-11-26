class Solution {
    public int rob(int[] nums) {
    // // Brute force using recursion- We are having two choices.
    //     return helper(nums,0);
    // Dp tabular method
        if(nums.length==1) return nums[0];
        int dp[] = new int[nums.length];
        dp[0]=nums[0];
        dp[1] = Math.max(nums[1],nums[0]);
        for(int i=2; i<nums.length; i++){
            dp[i] = Math.max(dp[i-2]+nums[i] , dp[i-1]);
        }

        return dp[nums.length-1];
    }
    // Recursion Brute force Part
    // public int helper(int[] nums, int i){
    //     if(i>=nums.length) return 0;
    //     // if we take this number
    //     int choice1 = nums[i] + helper(nums,i+2);

    //     // choice of leaving
    //     int choice2 = helper(nums,i+1);

    //     // in dono choice se jo max hoga usiko lejao.
    //     return Math.max(choice1,choice2);
    // }
}