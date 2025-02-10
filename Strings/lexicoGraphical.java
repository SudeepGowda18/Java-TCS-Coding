public class lexicoGraphical {
    static String solve(String str) {
    //     StringBuffer res = new StringBuffer();
    //     for (int i = 0; i < str.length(); i++) {
    //         int ascii = (int) str.charAt(i);
    //         if (ascii == 90) {
    //             res.append((char) (65));
    //         } else if (ascii == 122) {
    //             res.append((char) (97));
    //         }else if ((ascii >= 65 && ascii < 90) || (ascii >= 97 && ascii < 122)) {
    //             res.append((char) (ascii + 1));
    //         } else {
    //             res.append((char)ascii);
    //         }
    //     }
    //     return res.toString();

    //Alternative
    StringBuilder res = new StringBuilder();
    for (char ch : str.toCharArray()) {
        if (Character.isLetter(ch)) {
            char letter = (ch == 'Z') ? 'A' : (ch == 'z') ? 'a' : (char) (ch + 1);
            res.append(letter);
        } else {
            res.append(ch);
        }
    }
    return res.toString();
    }
    public static void main(String[] args) {
        String str = "sudeep gowda";
        System.out.println(solve(str));
    }
}
