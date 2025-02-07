package Strings;
import java.util.Scanner;
public class countCharacters {
    static void countCharacters(String str) {
        int vowels = 0, consonants = 0, spaces = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                    || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            } else if (ch == ' ') {
                spaces++;
            }
        }
        System.out.println("Vowels " + vowels);
        System.out.println("Consonants " + consonants);
        System.out.println("Spaces " + spaces);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        countCharacters(str);
    }
}
