class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int l = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + l;
            list.add(str.substring(i, j));
            i = j - 1;
        }

        return list;
    }
}
