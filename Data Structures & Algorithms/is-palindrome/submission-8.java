class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = 0; int r = s.length()-1;
        boolean isPalindrome = true;
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) {
                isPalindrome = false;
                break;
            }
            l++; r--;
        }
        return isPalindrome;
    }
}
