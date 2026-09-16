class Solution {
    public void sortColors(int[] arr) {
        // using optimal approach
        int low=0, mid=0, high = arr.length-1;
        // brute force mai starting mai 0 then 1 fir 2 insert karre the yaha bhi same 
        while(mid<=high){
            if(arr[mid]==0){
                // swap with the initial- low.
                int temp = arr[low];
                arr[low]= arr[mid];
                arr[mid]= temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                // jaha current mai hai wohi 1 ho to ?- aage badh jao...
                mid++;
            }else{
                int temp = arr[high];
                arr[high]= arr[mid];
                arr[mid]= temp;
                high--;
            }
        }

    }
}