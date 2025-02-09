import java.util.HashSet;

public class commonSubsequence {
    static int commonSubsequence(String s1, String s2) {
        HashSet<Character> str = new HashSet<>();
        for (char ch : s1.toCharArray()) {
            str.add(ch);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (str.contains(s2.charAt(i)))
                return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        String s1 = "sudeep";
        String s2 = "gowda";
        System.out.println(commonSubsequence(s1, s2));
    }
}
