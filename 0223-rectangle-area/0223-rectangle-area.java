class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int a1 = ((ay2-ay1) * (ax2-ax1));
        int b2 = ((by2-by1) * (bx2-bx1));

        // int nX1= Math.max(ax1, bx1);
        // int nY1 = Math.max(ay1, by1);
        // int nX2 = Math.min(ax2,bx2);
        // int nY2 = Math.min(ay2,by2);

        int x = Math.max(0,(Math.min(ax2,bx2) - (Math.max(ax1, bx1))));
        int y = Math.max(0,(Math.min(ay2,by2) - (Math.max(ay1, by1))));
        int area = x*y;
        return a1+b2-area;
    }
}