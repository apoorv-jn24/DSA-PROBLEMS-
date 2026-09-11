class Solution {
    public int totalNumbers(int[] digits) {
      int[] arr = new int[10];
      int ans=0;
      for(int a:digits) arr[a]++;
      for(int i=100; i<=999; i++){
        if(i%2!=0) continue;
         int a = i/100;
         int b = (i/10)%10;
         int c = i%10;

         arr[a]--;
         arr[b]--;
         arr[c]--;
         if(arr[a]>=0 && arr[b]>=0 && arr[c]>=0) ans++;
         arr[a]++;
         arr[b]++;
         arr[c]++;
      }
      return ans;
    }
}