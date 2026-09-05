class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans=-1;
        int n=nums.length;
        int[] minArr = new int[n];
        int minArra = Integer.MAX_VALUE;
        for(int i=n-1; i>=0; i--){
            minArr[i] = Math.min(minArra, nums[i]);
            minArra = minArr[i];
        }
        for(int i=0; i<n; i++){
            ans = Math.max(nums[i], ans);
            int avg = ans-minArr[i];
            if(avg<=k) return i;
        }
        return -1;
    }
}
