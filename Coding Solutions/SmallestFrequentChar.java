public class SmallestFrequentChar {
    public static char findCount(String s, int p) {
        s = s.toLowerCase();
        int[] freq = new int[26];
        for (int ch : s.toCharArray()) {
            if(ch >= 'a' && ch <= 'z')
            freq[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] >= p) {
                return (char) (i + 'a');
            }
        }
        return '-';
    }
    //Main Method
    public static void main(String[] args) {
        String s = "sudeep gowda";
        int p = 1;
        System.out.println(findCount(s, p));
    }
}
