class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        List<Integer>[] bucket = new List[nums.length + 1];

        for (var entry : freq.entrySet()) {
            int f = entry.getValue();
            if (bucket[f] == null)
                bucket[f] = new ArrayList<>();

            bucket[f].add(entry.getKey());
        }

        int[] ans = new int[k];
        int i = 0;

        for (int f = bucket.length - 1; f >= 0 && i < k; f--) {
            if (bucket[f] != null) {
                for (int n : bucket[f]) {
                    ans[i++] = n;
                    if (i == k) break;
                }
            }
        }

        return ans;
    }
}