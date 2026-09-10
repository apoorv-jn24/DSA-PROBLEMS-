class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // we can try all possible rotation and can do a match 
        // is it a good approach....???????...... constraints are lowwww.
        // lets dry run first. 
        for(int rot=0; rot<4; rot++){
            if(isSame(mat,target)) return true;
            mat=rotate(mat);
        }
        return false;
    }
    private int[][] rotate(int [][] mat){
        int n=mat.length;
        int ans[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ans[j][n-i-1] = mat[i][j];
            }
        }
        return ans;
    }
    private boolean isSame(int[][] mat, int[][] target){
        int n=mat.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]!=target[i][j]) return false;
            }
        }
        return true;
    }
}