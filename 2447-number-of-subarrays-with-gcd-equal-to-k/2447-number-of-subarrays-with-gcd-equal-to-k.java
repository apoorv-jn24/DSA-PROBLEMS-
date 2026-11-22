class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            int gcdA = nums[i];
            for(int j=i; j<nums.length; j++){
                gcdA = gcd(gcdA,nums[j]);
                if(gcdA==k) count++;
            }
        }
        return count;
    }
    private int gcd(int a, int b){
        while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
         }
        return a;
    }
}