public class removeVowels {
    static String removeVowels(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                res.append(ch);
            }
        }
        return res.toString();
    }
        public static void main(String[] args) {
            String s = "Sudeep gowda";
            System.out.println(removeVowels(s));
        }
}
