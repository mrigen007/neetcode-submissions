class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(
            Arrays.stream(strs)
                .collect(Collectors.groupingBy(
                    s -> {
                        char[] c = s.toCharArray();
                        Arrays.sort(c);
                        return new String(c);
                    }
                ))
                .values()
        );
    }
}