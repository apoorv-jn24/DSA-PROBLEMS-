class Solution {
    public int countSpecialIntegers(int[] nums) {
        int ans=0;
        int[] arr = new int[101];
        for(int num:nums) arr[num]++;
        for(int i=1; i<=100; i++){
            if(arr[i]==3){
                int first=-1;
                int second=-1;
                int third=-1;

            for(int x=0; x<nums.length; x++){
                if(nums[x]==i){
                    if(first==-1) first=x;
                    else if (second==-1) second=x;
                    else {
                        third = x;
                        break;
                    }
                }
            }
            if(second-first == third-second) ans++;
            }

        }
        return ans;
    }
}