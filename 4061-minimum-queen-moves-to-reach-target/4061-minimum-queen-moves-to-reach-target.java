class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        // for the queen there can be only four cases-
        // same row, column, diagonal.
        int sr= source[0], sr2 = source[1];
        int tr = target[0], tr2 = target[1];
        if(sr==tr && sr2==tr2) return 0;  // same index
        if(sr==tr || sr2==tr2) return 1;
        // same diagonal 
        if(Math.abs(sr-tr) == Math.abs(sr2-tr2)) return 1;
        return 2;
    }
}