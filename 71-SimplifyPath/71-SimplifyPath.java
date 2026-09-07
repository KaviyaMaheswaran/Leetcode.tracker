// Last updated: 9/7/2026, 4:23:42 PM
class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            }
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } 
            else {
                stack.push(part);
            }
        }
        String ans = "";
        for (String folder : stack) {
            ans += "/" + folder;
        }
        if (ans.equals("")) {
            return "/";
        }
        return ans;
    }
}