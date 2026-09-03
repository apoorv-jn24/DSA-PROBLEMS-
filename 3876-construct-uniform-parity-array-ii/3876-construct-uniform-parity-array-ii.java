class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0], oddCount=0;
        for(int x:nums1){
            min = Math.min(min,x);
            if(x%2!=0) oddCount++;
        }
        return min%2!=0 || oddCount==0;
    }
}