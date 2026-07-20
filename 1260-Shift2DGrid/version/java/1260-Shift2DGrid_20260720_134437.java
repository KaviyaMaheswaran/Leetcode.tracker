// Last updated: 7/20/2026, 1:44:37 PM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int[][] ans = new int[m][n];
6        k %= (m * n);
7        for (int i = 0; i < m; i++) {
8            for (int j = 0; j < n; j++) {
9                int index = i * n + j;
10                int newIndex = (index + k) % (m * n);
11
12                ans[newIndex / n][newIndex % n] = grid[i][j];
13            }
14        }
15        List<List<Integer>> result = new ArrayList<>();
16        for (int i = 0; i < m; i++) {
17            List<Integer> row = new ArrayList<>();
18            for (int j = 0; j < n; j++) {
19                row.add(ans[i][j]);
20            }
21            result.add(row);
22        }
23        return result;
24    }
25}