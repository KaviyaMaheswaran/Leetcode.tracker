// Last updated: 7/14/2026, 11:49:46 AM
1class Solution {
2    public String[] findWords(String[] words) {
3        String row1 = "qwertyuiop";
4        String row2 = "asdfghjkl";
5        String row3 = "zxcvbnm";
6        List<String> list = new ArrayList<>();
7        for (String word : words) {
8            String s = word.toLowerCase();
9            String row;
10            if (row1.indexOf(s.charAt(0)) != -1) {
11                row = row1;
12            } else if (row2.indexOf(s.charAt(0)) != -1) {
13                row = row2;
14            } else {
15                row = row3;
16            }
17            boolean valid = true;
18            for (int i = 1; i < s.length(); i++) {
19                if (row.indexOf(s.charAt(i)) == -1) {
20                    valid = false;
21                    break;
22                }
23            }
24            if (valid) {
25                list.add(word);
26            }
27        }
28        return list.toArray(new String[0]);
29    }
30}