class Solution {
    public String removeDigit(String s, char digit) {
        int n = s.length();
        int idx=-1;
        for(int i=0; i<n; i++){
            if(s.charAt(i)==digit){
                idx=i;
                if( i+1 <n && s.charAt(i)<s.charAt(i+1)) return s.substring(0,i) + s.substring(i+1, n);
            }
        }
        return  s.substring(0,idx) + s.substring(idx+1, n);
    }
}