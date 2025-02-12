public class calculateFrequency {
    public static void printFrequency(String str) {
        int[] freq = new int[26];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a')+ "->" + freq[i]);
            }
        }
    }
    //Main method
    public static void main(String[] args) {
        String str = "sudeep gowda";
        printFrequency(str);
    }
}
