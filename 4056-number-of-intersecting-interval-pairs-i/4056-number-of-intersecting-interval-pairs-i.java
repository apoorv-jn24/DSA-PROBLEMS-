class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int count=0;
        for(int i=0; i<intervals.length; i++){
            int first = intervals[i][0];
            int end1 = intervals[i][1];
            for(int j=i+1; j< intervals.length; j++){
                int second = intervals[j][0];
                int end2 = intervals[j][1];
                if(first<= end2 && second <=end1) count++;
            }
        }
        return count;
    }
}