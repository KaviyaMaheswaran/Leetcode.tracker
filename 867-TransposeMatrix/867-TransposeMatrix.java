// Last updated: 9/7/2026, 4:19:57 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
       int r=matrix.length;
       int c=matrix[0].length;
       int a[][]=new int[c][r];
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            a[j][i]=matrix[i][j];
        }
       }
        return a;       
    }
}