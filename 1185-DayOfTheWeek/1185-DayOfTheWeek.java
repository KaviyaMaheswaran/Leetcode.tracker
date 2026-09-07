// Last updated: 9/7/2026, 4:19:21 PM
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = {
            "Friday", "Saturday", "Sunday",
            "Monday", "Tuesday", "Wednesday", "Thursday"
        };
        int[] daysInMonth = {
            31,28,31,30,31,30,31,31,30,31,30,31
        };
        int totalDays = 0;
        for (int y = 1971; y < year; y++) {
            if (isLeap(y))
                totalDays += 366;
            else
                totalDays += 365;
        }
        for (int m = 1; m < month; m++) {
            totalDays += daysInMonth[m - 1];

            if (m == 2 && isLeap(year))
                totalDays++;
        }
        totalDays += day - 1;
        return week[totalDays % 7];
    }
    public boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}