public class valueCounter {
    public static void countValues(String str) {
        int vowels = 0, digits = 0, consonants = 0, special = 0, spaces = 0;
        str = str.toLowerCase();
        // for (char ch : str.toCharArray()) {
        //     if (Character.isDigit(ch)) {
        //         digits++;
        //     } else if ("aeiou".indexOf(ch) != -1) {
        //         vowels++;
        //     } else if (Character.isLetter(ch)) {
        //         consonants++;
        //     } else {
        //         special++;
        //     }
        // }
        // System.out.print("vowel : " + vowels +","+" consonants : " + consonants +","+ " digits : " + digits +","+ " special : " + special);
        // System.out.println();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                special++;
            }
        }
        System.out.println("vowel : " + vowels +","+" consonants : " + consonants +","+ " digits : " + digits +","+ " special : " + special + "," +"spaces : " + spaces);
    }
    public static void main(String[] args) {
        String str = "Sudeep@2554!!";
        countValues(str);
    }
}
