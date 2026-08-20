// Last updated: 8/20/2026, 2:07:00 PM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        boolean[][] row = new boolean[9][9];
4        boolean[][] col = new boolean[9][9];
5        boolean[][] box = new boolean[9][9];
6        for (int i = 0; i < 9; i++) {
7            for (int j = 0; j < 9; j++) {
8                if (board[i][j] == '.') {
9                    continue;
10                }
11                int num = board[i][j] - '1';
12                int boxIndex = (i / 3) * 3 + (j / 3);
13                if (row[i][num] || col[j][num] || box[boxIndex][num]) {
14                    return false;
15                }
16                row[i][num] = true;
17                col[j][num] = true;
18                box[boxIndex][num] = true;
19            }
20        }
21        return true;
22    }
23}