class Solution {
    public int normalRob(int[] nums, int st, int end){
        int n=nums.length;
        int dp[] = new int[n-1];
        dp[0]=nums[st];
        dp[1] = Math.max(nums[st+1],nums[st]);
        for(int i=st+2, j=2; i<=end; i++, j++){
            dp[j] = Math.max(dp[j-2]+nums[i] , dp[j-1]);
        }
        return dp[n-2];
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0], nums[1]);
        return Math.max(normalRob(nums,0,nums.length-2), normalRob(nums,1,nums.length-1));
    }
}