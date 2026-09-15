class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> list = new HashMap<>();

        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            list.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(list.values());
    }
}
