class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int total=0;
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) total++;
        }
        int ans=0;
        for(int i=0; i<n; i++){
            int score = total;
            if(i>0){
                if(s.charAt(i)==s.charAt(i-1)) score--;

                if(s.charAt(0)==s.charAt(n-1)) score++;
            }
               if(score==k) ans++;
        }
        return ans;
    }
}