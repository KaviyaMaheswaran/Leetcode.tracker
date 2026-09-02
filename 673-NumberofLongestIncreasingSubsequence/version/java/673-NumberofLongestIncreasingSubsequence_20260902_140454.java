// Last updated: 9/2/2026, 2:04:54 PM
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int five = 0;
4        int ten = 0;
5        for (int bill : bills) {
6            if (bill == 5) {
7                five++;
8            }
9            else if (bill == 10) {
10                if (five == 0)
11                    return false;
12
13                five--;
14                ten++;
15            }
16            else { 
17                if (ten > 0 && five > 0) {
18                    ten--;
19                    five--;
20                }
21                else if (five >= 3) {
22                    five -= 3;
23                }
24                else {
25                    return false;
26                }
27            }
28        }
29        return true;
30    }
31}