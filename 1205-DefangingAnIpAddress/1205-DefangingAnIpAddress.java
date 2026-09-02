// Last updated: 9/2/2026, 9:40:06 AM
class Solution {
    public String defangIPaddr(String address) {
        address=address.replace(".","[.]");
        return address;
    }
}