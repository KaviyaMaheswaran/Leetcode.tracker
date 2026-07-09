// Last updated: 7/9/2026, 9:14:43 AM
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int gap = timeSeries[i + 1] - timeSeries[i];
            if (gap < duration) {
                total += gap;
            } else {
                total += duration;
            }
        }
        total += duration;   
        return total;
    }
}