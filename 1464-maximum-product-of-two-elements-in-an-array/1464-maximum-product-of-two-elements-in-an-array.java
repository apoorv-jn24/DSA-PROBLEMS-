class Solution {
    public int maxProduct(int[] nums) {
        int maxi =0;
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]-1;
        }
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==0) break;
                int prod = nums[i]*nums[j];
                maxi = Math.max(maxi, prod);
            }
        }
        return maxi;
    }
}