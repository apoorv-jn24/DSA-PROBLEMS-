class Solution {
    public long maxPairStrength(int[] nums) {
        long maxi=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                long a = (long) nums[i]*nums[j];
                long b = gcd(nums[i], nums[j]) * gcd(nums[i], nums[j]);
                long ans = a/b;
                maxi=Math.max(maxi,ans);
            }
        }
        return maxi;
    }
    public long gcd(int a, int b){
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(b==0) return a;
        return b;
    }
}