class Solution {
    public int numIdenticalPairs(int[] nums) {
        // Simple brute force is using two for loops
        // Well based on constraints using brute force is good but if we use a hashmap of frequency array/ or Hash set, lets try to do that so.
        // Brute force 
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]==nums[j]) count++;
            }
        }
        return count;
    }
}