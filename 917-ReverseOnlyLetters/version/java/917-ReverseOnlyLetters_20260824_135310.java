// Last updated: 8/24/2026, 1:53:10 PM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[] a = s.toCharArray();
4        int left = 0;
5        int right = a.length - 1;
6        while (left < right) {
7            if (!Character.isLetter(a[left])) {
8                left++;
9            }
10            else if (!Character.isLetter(a[right])) {
11                right--;
12            }
13            else {
14                char temp = a[left];
15                a[left] = a[right];
16                a[right] = temp;
17                left++;
18                right--;
19            }
20        }
21        return new String(a);
22    }
23}