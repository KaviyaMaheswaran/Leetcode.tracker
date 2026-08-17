// Last updated: 8/17/2026, 2:55:24 PM
1class Solution {
2    public String toGoatLatin(String sentence) {
3        String[] words = sentence.split(" ");
4        String result = "";
5        for (int i = 0; i < words.length; i++) {
6            String word = words[i];
7            char first = word.charAt(0);
8            if (!(first == 'a' || first == 'e' || first == 'i' ||
9                  first == 'o' || first == 'u' ||
10                  first == 'A' || first == 'E' || first == 'I' ||
11                  first == 'O' || first == 'U')) {
12
13                word = word.substring(1) + first;
14            }
15            word = word + "ma";
16            for (int j = 0; j <= i; j++) {
17                word = word + "a";
18            }
19            result = result + word + " ";
20        }
21        return result.trim();
22    }
23}