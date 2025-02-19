public class customSort {
    public static String sortByKey(String s, String key) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        StringBuilder sortedKey = new StringBuilder();
        for (char ch : key.toCharArray()) {
            while (freq[ch - 'a']-- > 0) {
                sortedKey.append(ch);
            }
        }
        for (char ch : s.toCharArray()) {
            while (freq[ch - 'a']-- > 0) {
                sortedKey.append(ch);
            }
        }
        return sortedKey.toString();
    }
    public static void main(String[] args) {
        String s = "sudeep";
        String key = "sudep";
        System.out.println(sortByKey(s, key));
    }
}