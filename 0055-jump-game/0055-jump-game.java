class Solution {
    public boolean canJump(int[] nums) {
        // Agar ek array banau aur usme mark karu ki konsa element kaha tak jaa sakta hai.... Agar koi element 0 hua to iska mtlb hai wo aage nahi badh payega.
        int n = nums.length;
        int[] diff = new int[n+1];
        int reach = 0;
        for(int i=0; i<n; i++){
            reach+=diff[i]; //maximum jump note kar li yahase toh 
            // agar element 0 hua? to aage badh nahi payenge
            if(i!=0 && reach==0) return false;  // agar i wala catch nahi lagaya to first iteration mai hi false ho jayega;
            if(i==n-1) return true; // last index par pahuch gaye 
            int last = Math.min(n-1, i+nums[i]); 
            if(last>i){
                diff[i+1]++;
                diff[last+1]--;
            }
        }
        return true;
    }
}