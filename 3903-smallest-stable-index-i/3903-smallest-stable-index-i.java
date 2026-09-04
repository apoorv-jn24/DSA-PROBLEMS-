class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans=Integer.MAX_VALUE, max = Integer.MIN_VALUE;;
        for(int i=0; i<nums.length; i++){
            max =Math.max(max,nums[i]);
            int min = Integer.MAX_VALUE;
            for(int j=i; j<nums.length; j++){
                min = Math.min(min, nums[j]);
            }
            if(max-min <= k) ans = Math.min(ans,i);
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}