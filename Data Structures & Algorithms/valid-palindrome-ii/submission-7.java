class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            if (s.charAt(l) != s.charAt(r)) {

                int i = l + 1;
                int j = r;

                while (i < j && s.charAt(i) == s.charAt(j)) {
                    i++;
                    j--;
                }

                if (i >= j)
                    return true;

                i = l;
                j = r - 1;

                while (i < j && s.charAt(i) == s.charAt(j)) {
                    i++;
                    j--;
                }

                return i >= j;
            }

            l++;
            r--;
        }

        return true;
    }
}
