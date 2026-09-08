// Last updated: 9/8/2026, 1:58:56 PM
1class Solution {
2    public int[][] matrixBlockSum(int[][] mat, int k) {
3        int m = mat.length;
4        int n = mat[0].length;
5        int[][] ans = new int[m][n];
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8                int sum = 0;
9                for (int r = Math.max(0, i - k);
10                     r <= Math.min(m - 1, i + k); r++) {
11                    for (int c = Math.max(0, j - k);
12                         c <= Math.min(n - 1, j + k); c++) {
13                        sum += mat[r][c];
14                    }
15                }
16                ans[i][j] = sum;
17            }
18        }
19        return ans;
20    }
21}