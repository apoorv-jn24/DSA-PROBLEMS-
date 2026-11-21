class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = capacity[i]-rocks[i];
        }
        int count=0;
        Arrays.sort(arr);
        for(int num:arr){
            additionalRocks-=num;
            if(additionalRocks<0) break;
            count++;
        }
        return count;
    }
}