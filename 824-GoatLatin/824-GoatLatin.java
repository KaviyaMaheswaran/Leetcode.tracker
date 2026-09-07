// Last updated: 9/7/2026, 4:20:07 PM
class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char first = word.charAt(0);
            if (!(first == 'a' || first == 'e' || first == 'i' ||
                  first == 'o' || first == 'u' ||
                  first == 'A' || first == 'E' || first == 'I' ||
                  first == 'O' || first == 'U')) {

                word = word.substring(1) + first;
            }
            word = word + "ma";
            for (int j = 0; j <= i; j++) {
                word = word + "a";
            }
            result = result + word + " ";
        }
        return result.trim();
    }
}