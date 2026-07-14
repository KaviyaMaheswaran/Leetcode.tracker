// Last updated: 7/14/2026, 11:14:58 AM
1class Solution {
2    public double[] convertTemperature(double celsius) {
3        double kelvin = celsius + 273.15;
4        double fahrenheit = celsius * 1.80 + 32.00;
5        return new double[]{kelvin, fahrenheit};
6    }
7}