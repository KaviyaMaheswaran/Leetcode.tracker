// Last updated: 7/14/2026, 11:22:53 AM
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> row = new ArrayList<>();
4        row.add(1);
5        for (int i = 1; i <= rowIndex; i++) {
6            List<Integer> newRow = new ArrayList<>();
7            newRow.add(1);
8            for (int j = 1; j < i; j++) {
9                newRow.add(row.get(j - 1) + row.get(j));
10            }
11            newRow.add(1);
12            row = newRow;
13        }
14        return row;
15    }
16}