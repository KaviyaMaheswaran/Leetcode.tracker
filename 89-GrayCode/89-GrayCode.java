// Last updated: 7/9/2026, 9:16:09 AM
class Solution {
    public List<Integer> grayCode(int n) {
        int size = 1 << n; 
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }
}