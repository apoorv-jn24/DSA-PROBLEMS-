class Solution {
    public boolean isPalindrome(String str) {
        str=str.toLowerCase();
        String s="";
        for(int i=0; i<str.length(); i++){
            if(Character.isLetterOrDigit(str.charAt(i))) s+=str.charAt(i);
        }
        // alpha numeric characters...... ek aur loop.......
        int n=s.length();
        for(int i=0; i<n/2; i++){
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        return true;
    }
}