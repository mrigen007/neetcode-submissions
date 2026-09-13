class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0;
        int maxFreq = 0;
        int longest = 0;

        for (int r = 0; r < s.length(); r++) {
            int index = s.charAt(r) - 'A';

            freq[index]++;
            maxFreq = Math.max(maxFreq, freq[index]);

            while ((r - l + 1) - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            longest = Math.max(longest, r - l + 1);
        }

        return longest;
    }
}