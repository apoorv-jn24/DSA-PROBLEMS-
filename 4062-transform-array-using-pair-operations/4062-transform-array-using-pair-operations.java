class Solution {
    public boolean canTransform(int[] source, int[] target) {
        // Agar dono array ka sum equal ho jaye it means transformation possible???
        // constraints are high to long mai lelete hai sum
        long s=0, t=0;
        for(int i=0; i<source.length; i++){
            s+=source[i];
            t+=target[i];
        }
        return s==t;
    }
}
// worked