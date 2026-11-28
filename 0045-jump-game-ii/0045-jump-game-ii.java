class Solution {
    public int jump(int[] nums) {
        int count=0, currentOne=0, farthest=0;
        for(int i=0; i<nums.length-1; i++){
           farthest = Math.max(farthest, i+nums[i]);
           if(currentOne==i){
                count++;
               currentOne = farthest;
           }
        }
        return count;
    }
}