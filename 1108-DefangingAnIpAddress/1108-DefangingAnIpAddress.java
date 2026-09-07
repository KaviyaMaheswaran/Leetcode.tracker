// Last updated: 9/7/2026, 4:19:31 PM
class Solution {
    public String defangIPaddr(String address) {
        address=address.replace(".","[.]");
        return address;
    }
}