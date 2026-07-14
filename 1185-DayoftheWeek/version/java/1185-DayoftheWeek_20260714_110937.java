// Last updated: 7/14/2026, 11:09:37 AM
1class Solution {
2    public String dayOfTheWeek(int day, int month, int year) {
3        String[] week = {
4            "Friday", "Saturday", "Sunday",
5            "Monday", "Tuesday", "Wednesday", "Thursday"
6        };
7        int[] daysInMonth = {
8            31,28,31,30,31,30,31,31,30,31,30,31
9        };
10        int totalDays = 0;
11        for (int y = 1971; y < year; y++) {
12            if (isLeap(y))
13                totalDays += 366;
14            else
15                totalDays += 365;
16        }
17        for (int m = 1; m < month; m++) {
18            totalDays += daysInMonth[m - 1];
19
20            if (m == 2 && isLeap(year))
21                totalDays++;
22        }
23        totalDays += day - 1;
24        return week[totalDays % 7];
25    }
26    public boolean isLeap(int year) {
27        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
28    }
29}