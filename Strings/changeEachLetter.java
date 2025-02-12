public class changeEachLetter {
    static String modify(String str) {
        StringBuilder res = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                res.setCharAt(i, Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                res.setCharAt(i, Character.toLowerCase(ch));
            }
        }
        return res.toString();
    }
    //Main method
    public static void main(String[] args) {
        String str = "sUDEEP gOWDA";
        System.out.println(modify(str));
    }
}
