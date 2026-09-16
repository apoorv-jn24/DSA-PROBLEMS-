class Solution {
    public int majorityElement(int[] nums) {
        int freqNum=0, ans=0;
        for(int num:nums){
            if(freqNum==0) ans=num;
            if(num==ans) freqNum++;
            else freqNum--;
        }
        return ans;
    }
}