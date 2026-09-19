class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // the intitution can be we can check if any points touch the area or boundary of the circle then its overlapping the circle. we have to find the point 
        // Rectangle is axis aligned so we can find the closest point easily.- x axis and y axis closest point. Euclidean distance finding rule.?
        int closeX = Math.max(x1,Math.min(xCenter, x2));
        int closeY = Math.max(y1, Math.min(yCenter, y2));
        // jo bhi close point hoga wo nikal liya.. what to do to find the distance.
        int dx = closeX-xCenter;
        int dy = closeY-yCenter;


// euclidean distance formula. to check whether the point lie withing the radius distance or not.
        return (long) dx*dx + (long) dy*dy <=(long) radius * radius;

    }
}