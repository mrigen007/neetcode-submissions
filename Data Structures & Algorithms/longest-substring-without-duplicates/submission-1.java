class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        HashSet<Character> ch = new HashSet<>();
        int longest = 0;
        for(int r = 0; r < s.length(); r++) {
            while(ch.contains(s.charAt(r))){
                ch.remove(s.charAt(l));
                l++;
            }
            ch.add(s.charAt(r));
            longest = Math.max(longest, r-l+1);
        }
        return longest;
    }
}
