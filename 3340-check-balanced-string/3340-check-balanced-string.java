class Solution {
    public boolean isBalanced(String num) {
        int sumEven=0, sumOdd=0;
        for(int i=0; i<num.length(); i++){
            int digit = num.charAt(i)-'0';
            if(i%2==0) sumEven+=digit;
            else sumOdd+=digit;
        }
        return sumEven==sumOdd;
    }
}