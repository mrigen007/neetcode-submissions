class Solution {

    public String encode(List<String> strs) {
      StringBuilder str = new StringBuilder();

      for(String s: strs) {
        str.append(s.length()).append("#").append(s);
      }
      return str.toString();
    }

    public List<String> decode(String str) {
    List<String> result = new ArrayList<>();

    for (int i = 0; i < str.length();) {
        int split = str.indexOf('#', i);

        int length = Integer.parseInt(str.substring(i, split));

        int start = split + 1;
        result.add(str.substring(start, start + length));

        i = start + length;
    }

    return result;
    }
}
