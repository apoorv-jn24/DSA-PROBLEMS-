class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        // same question just constraints are different.
        long count=0;
        int n = intervals.length;
        // what if we sort both the intervals?????- linear array banake.
        int[] first = new int[n];
        int[] second = new int[n];
        for(int i=0; i<n; i++){
            first[i] = intervals[i][0];
            second[i] = intervals[i][1];
        }
        Arrays.sort(first);
        Arrays.sort(second);
        int idx =0;
        for(int i=0; i<n; i++){
            // jitne number end wale se chhote honge utne hi add kare jayenge sooo
            while(second[idx]< first[i]) idx++; //s=condition true hogi nahi yeh 
            count+= i-idx;
        }
        return count;
    }
}