// Last updated: 7/23/2026, 10:11:47 AM
1class Solution {
2    public String defangIPaddr(String address) {
3        address=address.replace(".","[.]");
4        return address;
5    }
6}