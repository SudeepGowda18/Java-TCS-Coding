import java.util.Scanner;

public class capitalizeFirstLast {
    static String capitalize(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s+");
        for (String word : words) {
            int n = word.length();
            if (n == 1) {
                result.append(Character.toUpperCase(word.charAt(0)));
            } else {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1, n - 1));
                result.append(Character.toUpperCase(word.charAt(n - 1)));
            }
            result.append(" ");
        }
        return result.toString();
    }
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        sc.close();
        System.out.println(capitalize(str));
    }
}
