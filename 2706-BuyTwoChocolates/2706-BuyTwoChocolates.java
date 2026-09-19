// Last updated: 9/19/2026, 5:15:53 PM
class Solution {
    public int buyChoco(int[] prices, int money) {
        int first = 101;
        int second = 101;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < first) {
                second = first;
                first = prices[i];
            } else if (prices[i] < second) {
                second = prices[i];
            }
        }
        int total = first + second;
        if (total <= money) {
            return money - total;
        }
        return money;
    }
}