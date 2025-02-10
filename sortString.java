public class sortString {
    static String sortString(String str) {
        int[] freq = new int[26];
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while(freq[i]-- > 0) {
                res.append((char) (i + 'a'));
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "Sushanth";
        System.out.println(sortString(str));
    }
}
